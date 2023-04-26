package com.example.springboot3database.integrationRedis;

import com.example.springboot3database.integrationRedis.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 10:49
 **/
@SpringBootTest
public class test {
    @Autowired
    private PersonService personService;
    @Test
    public void save(){
      personService.save();
    }
}
