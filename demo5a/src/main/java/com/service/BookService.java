package com.service;

import com.dao.BookDao;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public interface BookService {


    void addBook();

    void setBookDao(BookDao bookDao);
}
