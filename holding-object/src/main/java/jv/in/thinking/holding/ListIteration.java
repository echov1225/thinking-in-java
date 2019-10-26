package jv.in.thinking.holding;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>() {{
            add("Rat");
            add("Manx");
            add("Cymric");
            add("Mutt");
            add("Pug");
            add("Cymric");
            add("Pug");
            add("Manx");
        }};
        ListIterator<String> it = lists.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", " + it.nextIndex()
                    + ", " + it.previousIndex() + ";");
        }
        System.out.println();

        // Backwards
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println();
        System.out.println(lists);

        it = lists.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set("Special");
        }
        System.out.println(lists);
    } /* Output
    Rat, 1, 0;Manx, 2, 1;Cymric, 3, 2;Mutt, 4, 3;Pug, 5, 4;Cymric, 6, 5;Pug, 7, 6;Manx, 8, 7;
    Manx Pug Cymric Pug Mutt Cymric Manx Rat
    [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Manx]
    [Rat, Manx, Cymric, Special, Special, Special, Special, Special]
    *///:~

}
