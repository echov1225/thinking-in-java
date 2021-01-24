package jv.in.thinking.holding.foreach;

import java.util.Iterator;

/**
 * @author: shiwenwei
 * @date: 2021/1/24 11:06 PM
 * @since v1.0
 */
public class IterableClass implements Iterable<String> {

    protected String[] words = ("And that is how we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        for (String word : new IterableClass()) {
            System.out.print(word + " ");
        }
    }

}/*Output
And that is how we know the Earth to be banana-shaped.
*///:~
