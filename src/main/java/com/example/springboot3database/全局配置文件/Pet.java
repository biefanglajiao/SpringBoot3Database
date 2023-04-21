package com.example.springboot3database.全局配置文件;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/20 17:26
 **/
public class Pet {
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
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

    private String name;
    private int age;
}
