package com.example.springboot3database.integrationRedis.service;

import com.example.springboot3database.integrationRedis.domain.Address;
import com.example.springboot3database.integrationRedis.domain.Family;
import com.example.springboot3database.integrationRedis.domain.Person;
import com.example.springboot3database.integrationRedis.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 10:44
 **/
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void save(){
        Person person = new Person();
        person.setFirstname("常");
        person.setLastname("兆海");
        Address address = new Address();
        address.setCity("上海");
        person.setAddress(address);

        List<Family> families = new ArrayList<>();
        Family dad= new Family();
        dad.setUsername("常爸爸");
        dad.setType("爸爸");
        Family mom= new Family();
        mom.setUsername("常妈妈");
        mom.setType("妈妈");
        families.add(dad);
        families.add(mom);

        person.setFamilies(families);

      Person pe= personRepository.save(person);
        System.out.println(pe);
    }

}
