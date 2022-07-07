package com.kaltsit.service;

import com.kaltsit.mapper.BookMapper;
import com.kaltsit.pojo.Books;
import java.util.List;
public class BookServiceImpl implements BookService{


    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int insert(Books book) {
        return bookMapper.insert(book);
    }

    @Override
    public int deleteById(int id) {
        return bookMapper.deleteById(id);
    }

    @Override
    public int update(Books book) {
        return bookMapper.update(book);
    }

    @Override
    public Books queryById(int id) {
        return bookMapper.queryById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
