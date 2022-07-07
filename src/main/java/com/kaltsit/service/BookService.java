package com.kaltsit.service;

import com.kaltsit.pojo.Books;

import java.util.List;

public interface BookService {
    int insert(Books book);
    int deleteById(int id);
    int update(Books book);
    Books queryById(int id);
    List<Books> queryAllBooks();
}
