package com;

import com.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {

    /**
     * SimpleJdbcTemplate模板——更新
     */
    @Test
    public void test1(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        BookService bookService = context.getBean(BookService.class);
        bookService.addBook();
    }
}
