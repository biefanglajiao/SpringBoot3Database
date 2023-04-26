package com.example.springboot3database.integrationJPA;

import com.example.springboot3database.integrationJPA.domain.Discuss;
import com.example.springboot3database.integrationJPA.service.DiscussService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 9:57
 **/
@SpringBootTest
public class test {

    @Autowired
    private DiscussService discussService;
    @Test
    public void test(){
       discussService.test();
    }
   @Autowired
    private Discuss discuss;

    @Test
    public void test2(){
        discuss.setTitle("test5");
        discussService.save();
    }
    @Test
    public void test3(){
     discussService.findByIdPage();
    }
}
