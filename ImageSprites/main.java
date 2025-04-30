import java.util.HashSet;
import java.util.Set;

public class main{
    public static void main(String[] args) {
        Set<Set<Integer>> a = new HashSet<>();
        
        Integer [] obj = new Integer[] {Integer.valueOf(1)};
        Set<Integer> b = new HashSet<>();
        Set<Integer> d = new HashSet<>();
        d.add(8);
        d.add(9);
        d.add(10);
        d.add(11);
        b.add(8);
        b.add(9);
        a.add(b);
        System.out.println(a.hashCode());
        b.add(10);
        System.out.println(a.hashCode());
        System.out.println(a.hashCode());
        b.add(11);
        a.add(b);
        a.add(d);

        System.out.println(a);
    }
}
class b{
    static int c=5;
}
class d extends b{
    static int c=7;
}