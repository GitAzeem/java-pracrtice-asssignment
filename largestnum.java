package asssignmentPRACTICE;

import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("give num1 ");
        int num1 = in.nextInt();
        System.out.print("give num2 ");
        int num2 = in.nextInt();
        System.out.print("give num3 ");
        int num3 = in.nextInt();

        int max = num1;
        if (num2 > max){
            max = num2;
        }if (num3 > max){
            max = num3;
        }
        System.out.println("largest number is " +max);

    }
}
