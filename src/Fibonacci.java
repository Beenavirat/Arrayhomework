import java.util.Scanner;

//To print fibonacci series
public class Fibonacci {

   // java main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// scanner class
        System.out.println("enter any  number:");
        int num = scanner.nextInt();
        int i=0,j=1,nextTerm; //  initialization of variables
        System.out.println("Fibonacci series is");
        for (int c=0;c<num;c++) // for loop
        {
            // if  else  statement
            if (c<=1)
                nextTerm=c;
            else {
                nextTerm = i + j;
                i = j;
                j = nextTerm;
            }
            System.out.println(nextTerm);
            }
        }
    }




