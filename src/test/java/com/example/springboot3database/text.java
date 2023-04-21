package com.example.springboot3database;


import com.example.springboot3database.全局配置文件.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/20 17:30
 **/
@SpringBootTest
public class text {
    @Autowired
    private Person person;



    @Test
    public void test() {
        System.out.println("test");
        System.out.println(person);
    }
}
