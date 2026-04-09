package Day4.StringPractice;

import java.util.Scanner;

public class Equals {
    public static boolean equals(String s1, String s2) {
        char[] S1 = s1.toCharArray();
        char[] S2 = s2.toCharArray();
        for (int i = 0; i < S2.length; i++) {
            if (S1[i] != S2[i]) {
                return false;
            }

        }
        return true;
    }

    public static boolean equalignore(String s1, String s2){
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        char[] S1 = str1.toCharArray();
        char[] S2 = str2.toCharArray();
        for (int i = 0; i < S2.length; i++) {
            if (S1[i] != S2[i]) {
                return false;
            }

        }
        return true;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean equal = equals(str1, str2);
        System.out.println(equal);

        boolean ignorEqual = equalignore(str1, str2);
        System.out.println(ignorEqual);
    }
}
