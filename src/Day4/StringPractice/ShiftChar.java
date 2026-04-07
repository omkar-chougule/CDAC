package Day4.StringPractice;

import java.util.Scanner;

public class ShiftChar {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int len = string.length();
        char [] charr = new char[len];
        System.out.println("Enter the number of shifts : ");
        int shift =sc.nextInt();
        for (int i =0 ; i<len; i++ ){
            int index = (i - shift + len) % len;
            charr[index] = string.charAt(i);
        }
        String ans = new String(charr);
        System.out.println(ans);
    }
}
