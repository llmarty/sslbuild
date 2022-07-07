package com.kaltsit.mapper;

import com.kaltsit.pojo.Books;

import java.util.List;

public interface BookMapper {
    int insert(Books book);
    int deleteById(int id);
    int update(Books book);
    Books queryById(int id);
    List<Books> queryAllBooks();
}
