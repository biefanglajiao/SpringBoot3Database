package com.example.springboot3database.上传与下载.下载;

import com.example.springboot3database.上传与下载.domain.Filters;
import com.example.springboot3database.上传与下载.service.FiltersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/1 14:07
 **/
@Controller
public class DownController {

    @Autowired
    private FiltersService filtersService;
    @GetMapping("/down")
    public String down(Model model){
       List<Filters> all= filtersService.findAll();

       model.addAttribute("all",all);
        return "down";
    }
    @GetMapping("/download")
    public ResponseEntity<byte[]> download(String id) throws UnsupportedEncodingException {
        return filtersService.findById(id);
    }
}
