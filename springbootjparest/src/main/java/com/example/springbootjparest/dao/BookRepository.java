package com.example.springbootjparest.dao;

import com.example.springbootjparest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * 自定义访问路径
 * 全局跨域
 */
@CrossOrigin
@RepositoryRestResource(path = "bs", collectionResourceRel = "bs", itemResourceRel = "b")
public interface BookRepository extends JpaRepository<Book, Integer> {

    /**
     * 仅限该方法跨域
     * 自定义访问路径
     */
    @CrossOrigin
    @RestResource(path = "author", rel = "author")
    List<Book> findByAuthorContains(@Param(("author")) String author);

    /**
     * 自定义访问路径
     */
    @RestResource(path = "name", rel = "name")
    Book findByNameEquals(@Param("name") String name);

    /**
     * 禁止暴漏该方法
     * @param id
     */
    @RestResource(exported = false)
    void deleteById(Integer id);
}
