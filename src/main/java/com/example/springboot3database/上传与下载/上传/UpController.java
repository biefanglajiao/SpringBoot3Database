package com.example.springboot3database.上传与下载.上传;


import com.example.springboot3database.上传与下载.domain.Filters;
import com.example.springboot3database.上传与下载.service.FiltersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/1 10:29
 **/
@Controller
public class UpController {
    @GetMapping("/up")
    public String up(){
        return "upload";
    }
    @Autowired
    private Filters filters;
    @Autowired
    private FiltersService filtersService;
    @PostMapping("/upload")
    public String upload(MultipartFile[] upfile, Model model){
      model.addAttribute("uploadStstus","上传成功!!!");
 if (!filtersService.save(filters,upfile)){
     model.addAttribute("uploadStstus","上传失败!!!");
 }
        return "upload";
    }
}
