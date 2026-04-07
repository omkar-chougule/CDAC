package Day4.StringPractice;

import java.util.Scanner;
import java.lang.*;

public class CountuppAndlower {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        int cntU = 0;
        int lcnt = 0;
        int scnt = 0;

        char [] res = str1.toCharArray();
        for(char c : res){
           if(c >= 'A' && c <= 'Z'){
               cntU++;
           } else if (c >= 'a' && c <= 'z') {
               lcnt++;
           }
           else {
               scnt++;
           }
        }

        System.out.println("The count of Upper Character is "+cntU);
        System.out.println("The count of Lower Character is "+lcnt);
        System.out.println("The count of Special Character is "+scnt);
    }

}
