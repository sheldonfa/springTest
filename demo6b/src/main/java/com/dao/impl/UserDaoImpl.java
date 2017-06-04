package com.dao.impl;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author fangxin
 * @date 2017/6/4.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SimpleJdbcTemplate jdbcTemplate;

    @Override
    public void add(String name) {
        String sql = "INSERT INTO user VALUES (?,?) ";
        jdbcTemplate.update(sql,null,name);
    }
}
