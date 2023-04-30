package com.example.springboot3database.springMVC的整合.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/30 21:56
 **/
@Controller
public class AController {
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","czhhello");
        return "index";
    }
}
