
// Java program to count words and space in a string

import java.util.Scanner;

public class CountWords {
    // java main method
    public static void main(String[] args) {

//variable declaration
        String text;
        int countwords = 0;
        int space = 0;
        Scanner SC = new Scanner(System.in); // scanner class
        System.out.println("Enter a string:");
        text = SC.nextLine();

        // Word count
        for (int i = 0; i < text.length() ; i++) // for loop
        {
            // if statement
            if (text.charAt(i) == ' ') //&&  text.charAt(i+1) != ' '  ) // if  statement to check condition
            {
                countwords++;
                space++;
            }
        }
            System.out.println("Total number  of words in string are:" + (countwords +1 ));
        System.out.println("Total number  of  spaces in string are:" + (space ));
    }
}