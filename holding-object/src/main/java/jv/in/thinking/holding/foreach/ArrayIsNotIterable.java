package jv.in.thinking.holding.foreach;

import java.util.Arrays;

/**
 * @author: shiwenwei
 * @date: 2021/1/24 11:13 PM
 * @since v1.0
 */
public class ArrayIsNotIterable {

    static <T> void test(Iterable<T> it) {
        for (T t : it) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        // An array works in foreach, but it's not Iterable
        //! test(strings);
        // You must explicitly covert it to an Iterable
        test(Arrays.asList(strings));
    }

}/*Output
1 2 3 A B C
*///:~
