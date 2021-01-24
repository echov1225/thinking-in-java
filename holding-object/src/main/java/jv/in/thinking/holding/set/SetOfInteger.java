package jv.in.thinking.holding.set;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        final Random random = new Random(47);
        final Set<Integer> intSet = new HashSet<Integer>() {{
            for (int i = 0; i < 10000; i++) {
                add(random.nextInt(30));
            }
        }};
        System.out.println(intSet);
    }
}
