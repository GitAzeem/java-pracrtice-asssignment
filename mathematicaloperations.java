package asssignmentPRACTICE;

import java.util.Scanner;

public class mathematicaloperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first num ");
        int num1= in.nextInt();
        System.out.print("enter seceond number ");
        int num2= in.nextInt();
        int add= num1 + num2;
        int diff= num1 - num2;
        int pro= num1 * num2;
        int dev= num1/num2;
        int rem= num1%num2;
        System.out.println("sum = "+add);
        System.out.println("product = "+pro);
        if (num1 > num2){
            System.out.println("difference is "+diff);
        }else {
            System.out.println("diffrence is "+-1*diff);
        }
        if (num1>num2){
            System.out.println("quotient is "+dev);
        }else{
            System.out.println("denominator > numerator,error!!");
        }
        System.out.println("remainder is " +rem);
    }
}
