package com.dao.impl;

import com.dao.BookDao;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author fangxin
 * @date 2017/6/4.
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SimpleJdbcTemplate jdbcTemplate;

    public void addBook() {
        String sql = "update book set name = ? where id = ?";
        jdbcTemplate.update(sql,"zhangsan",1);
    }
}
