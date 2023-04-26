package com.example.springboot3database.integrationJPA.service;

import com.example.springboot3database.integrationJPA.domain.Discuss;
import com.example.springboot3database.integrationJPA.repository.DiscussRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 9:55
 **/
@Service
public class DiscussService {
    @Autowired
    private DiscussRepository discussRepository;
    @Autowired
    private Discuss Discuss;

    public void test(){
        System.out.println(discussRepository.findByTitleNotNull());
    }
    public  void  save(){
        discussRepository.save(Discuss);
    }




    public void findByIdPage(){
        Pageable pageable = PageRequest.of(0,2);
       List<Discuss> discusses= discussRepository.getDiscussPaged(1,pageable);
        //Q: 为什么没有返回值？
        //A: 因为是分页查询，所以返回的是一个Page对象，而不是List对象
        //Q: 如何获取Page对象中的数据？
        //A: 通过getContent()方法获取
        System.out.println(discusses);
    }
}
