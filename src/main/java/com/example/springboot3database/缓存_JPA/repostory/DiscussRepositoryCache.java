package com.example.springboot3database.缓存_JPA.repostory;

import com.example.springboot3database.integrationJPA.domain.Discuss;
import com.example.springboot3database.缓存_JPA.domain.DiscussCache;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 9:52
 **/
public interface DiscussRepositoryCache extends JpaRepository<DiscussCache,Integer> {
    public List<DiscussCache> findByTitleNotNull();

    //分页查询
@Query("select c from t_discussCache c where c.id=?1")
    public List<DiscussCache> getDiscussPaged(Integer id, Pageable pageable);
}
