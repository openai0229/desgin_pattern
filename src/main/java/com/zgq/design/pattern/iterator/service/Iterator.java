package com.zgq.design.pattern.iterator.service;

/**
 * 功能描述
 * boolean hasNext(); 检查有没有下一个元素
 * Object next(); 获取下一个元素
 * @author: zgq
 * @date: 2024年10月26日 12:10
 */
public interface Iterator {

    boolean hasNext();

    Object next();
}
