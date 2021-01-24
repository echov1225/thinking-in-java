package jv.in.thinking.holding.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: shiwenwei
 * @date: 2020/5/1 3:35 下午
 * @since v1.0
 */
public class SetOperations {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        Collections.addAll(setA, "A B C D E F G H I J K L".split(" "));
        System.out.println("H: " + setA.contains("H"));
        System.out.println("N: " + setA.contains("N"));
        Set<String> setB = new HashSet<>();
        Collections.addAll(setB, "H I J K L".split(" "));
        System.out.println("setB in setA: " + setA.containsAll(setB));
        setA.remove("H");
        System.out.println("setA: " + setA);
        System.out.println("setB in setA: " + setA.containsAll(setB));
        setA.removeAll(setB);
        System.out.println("setB removed from setA: " + setA);
        Collections.addAll(setA, "X Y Z".split(" "));
        System.out.println("'X Y Z' added to setA: " + setA);
    }
}
