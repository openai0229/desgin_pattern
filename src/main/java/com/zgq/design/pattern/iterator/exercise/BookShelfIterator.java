package com.zgq.design.pattern.iterator.exercise;

import com.zgq.design.pattern.iterator.service.Iterator;

/**
 * 功能描述
 * BookShelf的迭代器,用来遍历BookShelf
 * @author: zgq
 * @date: 2024年10月26日 12:11
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}