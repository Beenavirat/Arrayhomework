import java.util.Scanner;
// To find no is  Armstrong or not  (0,1,153,370,371,407 etc are armstrong no)
public class ArmstrongExample {

    //To check given number is armstrong or not
    public static void main(String[] args)
    {
        int c = 0, a, temp;
        Scanner scanner = new Scanner(System.in);   // scanner class
        System.out.println("enter any three digit number:");
        int num = scanner.nextInt();
        temp=num;
        while (num > 0)
        {
            a = num % 10;
            num = num / 10;
            c = c + (a * a * a);
        }
        if (temp == c)

            System.out.println("armstrong number");
        else
            System.out.println(" not armstrong number");
        }

    }




