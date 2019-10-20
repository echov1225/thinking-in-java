package jv.in.thinking.holding;

import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        collection.add("animal");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        map.put("animal", "UNKNOW");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(PrintingContainers.fill(new ArrayList<String>()));
        System.out.println(PrintingContainers.fill(new LinkedList<String>()));
        System.out.println(PrintingContainers.fill(new HashSet<String>()));
        System.out.println(PrintingContainers.fill(new TreeSet<String>()));
        System.out.println(PrintingContainers.fill(new LinkedHashSet<String>()));
        System.out.println(PrintingContainers.fill(new HashMap<String, String>()));
        System.out.println(PrintingContainers.fill(new LinkedHashMap<String, String>()));
        System.out.println(PrintingContainers.fill(new TreeMap<String, String>()));
    } /* Output
    [rat, cat, dog, dog, animal]
    [rat, cat, dog, dog, animal]
    [rat, cat, animal, dog]
    [animal, cat, dog, rat]
    [rat, cat, dog, animal]
    {rat=Fuzzy, cat=Rags, animal=UNKNOW, dog=Spot}
    {rat=Fuzzy, cat=Rags, dog=Spot, animal=UNKNOW}
    {animal=UNKNOW, cat=Rags, dog=Spot, rat=Fuzzy}
    *///:~
}
