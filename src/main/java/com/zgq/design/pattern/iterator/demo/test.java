package com.zgq.design.pattern.iterator.demo;

/**
 * 功能描述
 *
 * @author: zgq
 * @date: 2024年10月26日 11:57
 */
public class test {
    public static void main(String[] args) {
        int[] numbers = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[i] = " + numbers[i]);
        }
    }
}
