package com.zgq.design.pattern.iterator;

import com.zgq.design.pattern.iterator.domain.entity.Book;
import com.zgq.design.pattern.iterator.service.Iterator;
import com.zgq.design.pattern.iterator.service.impl.BookShelf;

/**
 * 功能描述
 * 程序测试运行类
 * @author: zgq
 * @date: 2024年10月26日 13:10
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
