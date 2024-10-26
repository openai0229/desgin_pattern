package com.zgq.design.pattern.iterator.service.impl;

import com.zgq.design.pattern.iterator.domain.entity.Book;
import com.zgq.design.pattern.iterator.service.Aggregate;
import com.zgq.design.pattern.iterator.service.Iterator;

/**
 * 功能描述
 * 这个是书架类，表示书的集合类
 * @author: zgq
 * @date: 2024年10月26日 12:11
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;


    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
