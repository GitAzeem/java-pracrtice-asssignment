package asssignmentPRACTICE;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter the number ");
        int num1 = input.nextInt();
        if (num1 % 2 == 0){
            System.out.println("the number is even");


        }else {
            System.out.println("the number is odd");

        }


    }
}
