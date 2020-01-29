// printing multiplication table


import java.util.Scanner;

public class MultiplicationTable {
    // java main method
    public static void main(String[] args) {
int n,i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer to print it is a multiplication table"); // scanner class
         n = scanner.nextInt();

          for ( i=1;i<=10;i++)// to print table of no up to 10

       {
            System.out.println("" +n+  "X"+i+"=" + (n *i));
        }

    }

}
