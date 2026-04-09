package Day4.wrapper;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoString {
    static void main() {
        String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1 == s2); //true it create only one string in string pool both object point to same string

        String n1 = new String("welcome");
        String n2 = new String("welcome");

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        String n3 = n1.intern();
        System.out.println(s1==n3);
        System.out.println(n1==n3);


        String sent = "hellow how are you";
        String [] words=sent.split(" ");
        System.out.println(Arrays.toString(words));

        sent = String.join("-", words);
        System.out.println(sent);
    }
}
