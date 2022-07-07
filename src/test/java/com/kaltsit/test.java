package com.kaltsit;

import com.kaltsit.pojo.Books;
import com.kaltsit.service.BookService;
import com.kaltsit.service.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        String config = "ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        BookService book = context.getBean("bookServiceImpl", BookService.class);
        int res=book.insert(new Books(1,"111",2,"222"));
        System.out.println(res);
    }
}
