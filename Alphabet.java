package pack4;

import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class Alphabet {

        public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            char ch = sc.next().charAt(0);
            System.out.println("Enter a character");

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                System.out.println(ch + " is vowel");
            else
                System.out.println(ch + " is consonant");

        }
    }
