package com.example.web.controller;

import com.example.web.exception.CannotDeleteException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
@ControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(CannotDeleteException.class)
    public String cannotDelete() {
        return "cannotdelete";
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "额外信息");
    }
}
