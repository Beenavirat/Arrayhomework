import com.sun.deploy.security.SelectableSecurityManager;
// To find specific value of element in array
import java.util.Scanner;

public class Specificvalue {
// java main method
    public static void main(String[] args) {
        int[] array1 = {11, 22, 47, 78, 95};

        Scanner scanner = new Scanner(System.in); // scanner class
        System.out.println("enter any  number:");
        int num = scanner.nextInt();
        for (int i = 0; i < array1.length; i++) // for loop to check condition
        {
// if statement
            if (num == array1[i]) // if coodition to check enter value with array element
            {
                System.out.println("Array contains the given value");

            }
        }
    }
}


