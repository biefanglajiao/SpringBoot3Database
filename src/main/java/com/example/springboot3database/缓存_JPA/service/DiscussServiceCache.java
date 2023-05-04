package com.example.springboot3database.缓存_JPA.service;

import com.example.springboot3database.缓存_JPA.domain.DiscussCache;
import com.example.springboot3database.缓存_JPA.repostory.DiscussRepositoryCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/26 9:55
 **/
//@Cacheable(value = "discusss")//开启查询缓存

/**
 * 8
 *
 * @多个条件： 要放到方法上 @Caching(
 * cacheable = {
 * @Cacheable(value = "discusss")
 * },
 * put = {
 * @CachePut(value = "discusss")
 * }
 * )
 */

@Service
public class DiscussServiceCache {
    @Autowired
    private DiscussRepositoryCache discussRepository;


    //test方法的缓存key为字符串"all"，其他方法的缓存key为#id。这样，不同方法的缓存key就是统一的了。

@Caching(
        cacheable = {
                @Cacheable(value = "discusss", key = "'all'")
        },
        put = {
                @CachePut(value = "discusss", key = "'all'")
        }
)
//todo 删除方法后 缓存会更新 但是update后不会更新
    public List<DiscussCache> test() {
        return discussRepository.findByTitleNotNull();
    }


    @Cacheable(value = "discusss", key = "#id")
    public DiscussCache findById(Integer id) {
        return discussRepository.findById(id).get();
    }

    @CacheEvict(value = "discusss", key = "#id", allEntries = true)
//@CacheEvict注解中的allEntries属性设置为true，表示删除整个缓存（即所有key所对应的缓存内容），而不只是删除指定key所对应的缓存内容。这样，当你调用deleteById方法删除指定id的DiscussCache对象时，同时也会删除"all"这个key所对应的缓存内容，从而确保缓存的一致性。
    public boolean deleteById(Integer id) {
        discussRepository.deleteById(id);
        return discussRepository.existsById(id);
    }

    @CachePut(value = "discusss", key = "#id")
    public DiscussCache update(String title, Integer id) {
        Optional<DiscussCache> discussCache = discussRepository.findById(id);
        DiscussCache discussCache1 = discussCache.get();
        discussCache1.setTitle(title);
        discussRepository.findByTitleNotNull();//执行一次查询，将查询结果放入缓存
        //Q:如何将此次查询的结果更新test方法的缓存
        //A:在test方法上添加@CachePut注解
        return discussRepository.save(discussCache1);
    }


    public void findByIdPage() {
        Pageable pageable = PageRequest.of(0, 2);
        List<DiscussCache> discusses = discussRepository.getDiscussPaged(1, pageable);

        System.out.println(discusses);
    }
}
