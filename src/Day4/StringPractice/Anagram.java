package Day4.StringPractice;
import java.util.Scanner;

public class Anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Normalize: ignore spaces and case
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        int[] freq = new int[26]; // assuming only a-z letters

        for (char c : str1.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                System.out.println("Not an Anagram");
                return;
            }
        }

        System.out.println("String is an Anagram");
    }
}
