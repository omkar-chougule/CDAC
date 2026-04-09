package Day4.wrapper;

public class DemoConversion {
    static void main() {
        int i = 10;
        Integer j = Integer.valueOf(i); // primitive to object
        int k = j.intValue(); // object to primitive
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        //post java 5
        int x = 20;
        Integer y = x; //auto boxing
        int z = y; //auto unboxing

        System.out.println(y);
        System.out.println(z);

        //String parsing
        String n = "30";
        int m = Integer.parseInt(n);

        Integer p = Integer.valueOf(m);
        System.out.println(m);
        System.out.println(p);
    }

}
