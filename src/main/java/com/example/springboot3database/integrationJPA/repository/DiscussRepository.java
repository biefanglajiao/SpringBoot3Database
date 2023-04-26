package com.example.springboot3database.integrationJPA.repository;

import com.example.springboot3database.integrationJPA.domain.Discuss;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 9:52
 **/
public interface DiscussRepository extends JpaRepository<Discuss,Integer> {
    public List<Discuss> findByTitleNotNull();

    //分页查询
@Query("select c from t_discuss c where c.id=?1")
    public List<Discuss> getDiscussPaged(Integer id, Pageable pageable);
}
