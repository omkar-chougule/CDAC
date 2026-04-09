package Day4.StringPractice;

import java.util.Scanner;

public class CheckStringUpper {
    public static boolean isUpper(char[] strarr) {
        for (char c : strarr) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char[] strarr = str1.toCharArray();
        boolean ans = isUpper(strarr);
        System.out.println(ans);
    }
}