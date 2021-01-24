package jv.in.thinking.holding.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: shiwenwei
 * @date: 2021/1/24 11:31 PM
 * @since v1.0
 */
public class AdapterMethodIdiom {

    public static void main(String[] args) {
        ReversibleArrayList<String> list = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        // Grabs the ordinary iterator via iterator()
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        // Hand it the Iterable of you choice
        for (String s : list.reversed()) {
            System.out.print(s + " ");
        }
    }

}/* Output
To be or not to be
be to not or be To
*///:~

class ReversibleArrayList <T> extends ArrayList<T> {

    public ReversibleArrayList(Collection<? extends T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {

            int count = size() - 1;

            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    @Override
                    public boolean hasNext() {
                        return count >= 0;
                    }

                    @Override
                    public T next() {
                        return get(count--);
                    }
                };
            }
        };
    }
}
