import java.util.Scanner;

public class Reverseofdigit {

//To find reverse of any input number
    public static void main(String[] args) {

      int num=0;
      int reversenum=0;

        Scanner scanner = new Scanner(System.in);// scanner class
        System.out.println("enter any number:");
        num = scanner.nextInt();
        while(num!=0)  // while loop for check condition
        {
            reversenum =reversenum  *10;
            reversenum = reversenum + num%10;
            num=num/10;
        }
        System.out.println("reverse of input number is:" +reversenum);
    }
}




