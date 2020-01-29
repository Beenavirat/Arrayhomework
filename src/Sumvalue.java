import java.util.Scanner;

public class Sumvalue {
// java main metho
    public static void main(String[] args) {
        // scanner class
        Scanner scanner = new Scanner(System.in);
        int [] array=new int[5];
        int sum=0;

       System.out.println("enter  elements:");
       // for loop
             for (int i = 0; i < 5; i++)
        {
            array[i]=scanner.nextInt();
        }
             // for loop
             for (int num: array)
             {
                 sum = sum + num;
             }
            System.out.println("Sum of array  elements is:"+sum);


        }
    }

