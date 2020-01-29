
// To count  'a'  in given string

import java.util.Scanner;

public class Countainstring {
// java main method
    public static void main(String[] args) {
        // variable declaration
        String s;
        char ch;
        int i=0;
        // scanner class
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter a string:");
        s= SC.nextLine();
        System.out.println( "a in a string:");
// for loop
        for (int j=0;j<s.length();j++)
        {
            ch=s.charAt(j);
         //   if statement
            if (ch=='a')
            {
                System.out.println(ch);
            }
        }
    }
}
