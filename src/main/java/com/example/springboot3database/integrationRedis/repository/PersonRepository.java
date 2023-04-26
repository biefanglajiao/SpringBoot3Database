package com.example.springboot3database.integrationRedis.repository;

import com.example.springboot3database.integrationRedis.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 10:40
 **/

public interface PersonRepository extends CrudRepository<Person ,String> {
    List<Person> findByFirstname(String firstname);
}
