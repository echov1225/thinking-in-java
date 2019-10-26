package jv.in.thinking.holding;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<String> linkedLists = new LinkedList<String>(){{
           add("Rat");
           add("Manx");
           add("Cymric");
           add("Mutt");
           add("Pug");
        }};
        System.out.println(linkedLists);

        // Identical
        System.out.println("linkedLists.getFirst(): " + linkedLists.getFirst());
        System.out.println("linkedLists.element(): " + linkedLists.element());
        // Only differs in empty-list behavior
        System.out.println("linkedLists.peek(): " + linkedLists.peek());

        // Identical; remove and return the first elements
        System.out.println("linkedLists.removeFirst(): " + linkedLists.removeFirst());
        System.out.println("linkedLists.remove(): " + linkedLists.remove());
        // Only differs in empty-list behavior
        System.out.println("linkedLists.poll(): " + linkedLists.poll());
        System.out.println(linkedLists);

        linkedLists.addFirst("AddFirst");
        System.out.println("After addFirst(): " + linkedLists);
        linkedLists.offer("Offer");
        System.out.println("After offer(): " + linkedLists);
        linkedLists.add("Add");
        System.out.println("After add(): " + linkedLists);
        linkedLists.addLast("AddLast");
        System.out.println("After addLast(): " + linkedLists);
        System.out.println("linkedLists.removeLast(): " + linkedLists.removeLast());

        System.out.println(linkedLists);
    } /* Output:
    [Rat, Manx, Cymric, Mutt, Pug]
    linkedLists.getFirst(): Rat
    linkedLists.element(): Rat
    linkedLists.peek(): Rat
    linkedLists.removeFirst(): Rat
    linkedLists.remove(): Manx
    linkedLists.poll(): Cymric
    [Mutt, Pug]
    After addFirst(): [AddFirst, Mutt, Pug]
    After offer(): [AddFirst, Mutt, Pug, Offer]
    After add(): [AddFirst, Mutt, Pug, Offer, Add]
    After addLast(): [AddFirst, Mutt, Pug, Offer, Add, AddLast]
    linkedLists.removeLast(): AddLast
    [AddFirst, Mutt, Pug, Offer, Add]
    *///:~
}
