package com.example.springboot3database.缓存_JPA.controller;

import com.example.springboot3database.缓存_JPA.domain.DiscussCache;
import com.example.springboot3database.缓存_JPA.service.DiscussServiceCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/4 16:13
 **/
@RestController
public class DisscussCacheController {
    @Autowired
    private DiscussServiceCache discussServiceCache;

    @GetMapping("/get/{id}")
    public DiscussCache get(@PathVariable("id") int id) {
   return discussServiceCache.findById(id);

    }
    @GetMapping("/gets")
    public List<DiscussCache> get() {
      List<DiscussCache> list=discussServiceCache.test();
      return  list;
    }
    @GetMapping("/update/{title}/{id}")
    public DiscussCache save(@PathVariable("title") String title,@PathVariable("id") int id) {

     return  discussServiceCache.update(title,id);
    }
    @GetMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
       return discussServiceCache.deleteById(id);
    }
}
