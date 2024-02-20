import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        fillSet(set1,2);
        fillSet(set2,3);
        Set<Integer> newSet = new HashSet<Integer>(set1);
        newSet.retainAll(set2);
        System.out.println(newSet);
    }
    public static void fillSet(Set<Integer> set, int x) {
        for (int i = 0; i <= 30; i++) {
            if (i % x == 0) {
                set.add(i);
            }
        }
    }
}