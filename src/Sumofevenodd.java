import java.util.Scanner;
// To calculate the sum of odd and even numbers
public class Sumofevenodd {
// java main method
    public static void main(String[] args) {

        int n, i, evensum = 0, oddsum = 0;// initialization of variables
        Scanner scanner = new Scanner(System.in);   // scanner class
        System.out.println("enter no of elements in array :");
         n = scanner.nextInt();
         int[] a=new int[n];
        System.out.println("Enter the elements of the array:");

        // for loop
        for (  i = 0; i < n; i++)
        {
            a[i]= scanner.nextInt();

        }
        // for loop
        for (  i = 0; i < n; i++)
        {
            // if  else statement
            if (a[i] % 2 == 0)
            {
                evensum = evensum + a[i];
            } else
                {
                oddsum = oddsum + a[i];
            }
        }
            System.out.println("\n The sum of even numbers up to " + n + " = "+ evensum);
            System.out.println("\n  The sum of odd numbers up to " + n +" = " +  oddsum);



        }
    }
