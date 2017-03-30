package com.example.web.controller;

import com.example.web.User;
import com.example.web.dao.UserDao;
import com.example.web.dao.UserResposity;
import com.example.web.exception.CannotDeleteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
@Controller
public class HomeController {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserResposity userResposity;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("test", "this is for test");
        return "home";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
    public String registerProcess(@Valid User user, BindingResult result, Model model) {
        userDao.register();
        User user1 = userResposity.findByUserName(user.getUsername());

        if(result.hasErrors()) {
            return "/register";
        }
        if(!(StringUtils.isEmpty(user1))) {
            model.addAttribute("msg", "this username has been used");
            return "/register";
        }
        userResposity.save(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/deleteByName", method = RequestMethod.POST)
    public @ResponseBody String deleteByName(@RequestParam("username")String username) {
        User user = userResposity.findByUserName(username);
        if(StringUtils.isEmpty(user)) {
            throw new CannotDeleteException();
        }else{
            Long id = user.getId();
            userResposity.delete(id);
            return "delete success";
        }
    }

    @RequestMapping("/advice")
    public @ResponseBody String getSomething(@ModelAttribute("msg")String msg) {
        return "获取到的msg:"+msg;
    }
}
