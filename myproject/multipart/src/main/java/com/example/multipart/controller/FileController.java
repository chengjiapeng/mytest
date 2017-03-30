package com.example.multipart.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
@Controller
public class FileController {
    //第一种方式
//    @RequestMapping(value = "/upload", method = RequestMethod.POST)
//    public @ResponseBody String upload(MultipartFile file) {
//        try {
//            FileUtils.writeByteArrayToFile(new File("d:/upload/"+file.getOriginalFilename()), file.getBytes());
//            return "ok";
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "wrong";
//        }
//    }

    //第二种方式
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file) {
        try {
            file.transferTo(new File("d:/upload/"+file.getOriginalFilename()));
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }
    }
}
