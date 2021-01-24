package jv.in.thinking.holding.set;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author: shiwenwei
 * @date: 2020/5/1 3:21 下午
 * @since v1.0
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> intSet = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            intSet.add(random.nextInt(30));
        }
        System.out.println(intSet);
    }
}/*
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
*///:~
