package jv.in.thinking.typeinfo.pets;

/**
 * @author: shiwenwei
 * @date: 2021/1/23 11:23 PM
 * @since v1.0
 */
public class Individual implements Comparable<Individual> {

    private static long counter = 0;

    private final long id = counter++;

    private String name;

    public Individual(String name) {
        this.name = name;
    }

    public Individual() {}

    @Override
    public String toString() {
        return getClass().getSimpleName() + ((name == null) ? "" : " " + name);
    }

    public long id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Individual that = (Individual) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (name != null) {
            result = 37 * result + name.hashCode();
        }
        result = result * 37 + (int) id;
        return result;
    }

    @Override
    public int compareTo(Individual arg) {
        // Compare by class name first
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if (firstCompare != 0) {
            return firstCompare;
        }

        if (name != null && arg.name != null) {
            int secondCompare = name.compareTo(arg.name);
            if (secondCompare != 0) {
                return secondCompare;
            }
        }
        return Long.compare(arg.id, id);
    }

}
