//Code to check for palindromic strings
package Abhishek;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome_String {
    static boolean checkPalindrome(String word){
        word = word.toLowerCase(Locale.ROOT);
        StringBuilder newWord = new StringBuilder();
        char letter;
        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i);
            newWord.insert(0, letter);
        }
        return newWord.toString().equals(word);
    }
    public static void main(String[] args) {
        Scanner news = new Scanner(System.in);
        String word;
        System.out.println("Enter word");
        word = news.next();
        if (checkPalindrome(word)){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
