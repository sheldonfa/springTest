package com;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class BookService {

    private BookDao bookDao;

    public void addBook(){
        bookDao.addBook();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
