package com.zgq.design.pattern.iterator.exercise;

import com.zgq.design.pattern.iterator.domain.entity.Book;
import com.zgq.design.pattern.iterator.service.Aggregate;
import com.zgq.design.pattern.iterator.service.Iterator;

import java.util.ArrayList;
import java.util.List;


/**
 * 功能描述
 * 这个是书架类，表示书的集合类
 *
 * @author: zgq
 * @date: 2024年10月26日 12:11
 */
public class BookShelf implements Aggregate {

    private List<Book> books;


    public BookShelf(int initialSize) {
        this.books = new ArrayList<>(initialSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
       this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}