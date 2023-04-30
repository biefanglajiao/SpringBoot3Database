package com.example.springboot3database.全局配置文件;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: 常兆海
 * @Description: 配置文件注入属性。
 * @DateTime: 2023/4/20 17:19
 **/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;


    private int age;
    private Pet pet;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


}
