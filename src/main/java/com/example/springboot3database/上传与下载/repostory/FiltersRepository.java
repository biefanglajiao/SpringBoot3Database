package com.example.springboot3database.上传与下载.repostory;

import com.example.springboot3database.integrationJPA.domain.Discuss;
import com.example.springboot3database.上传与下载.domain.Filters;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 9:52
 **/
public interface FiltersRepository extends JpaRepository<Filters,Integer> {

@Query("select c from t_filters c where c.id=?1")
    Object findById(String id);
}
