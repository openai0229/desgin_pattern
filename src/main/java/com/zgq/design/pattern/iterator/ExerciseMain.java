package com.zgq.design.pattern.iterator;

import com.zgq.design.pattern.iterator.domain.entity.Book;
import com.zgq.design.pattern.iterator.exercise.BookShelf;
import com.zgq.design.pattern.iterator.service.Iterator;

/**
 * 功能描述
 *
 * @author: zgq
 * @date: 2024年10月26日 14:17
 */
public class ExerciseMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        bookShelf.appendBook(new Book("E"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
