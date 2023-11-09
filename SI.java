package asssignmentPRACTICE;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter pricipal amount ");
        float P = in.nextFloat();
        System.out.print("enter rate in per annum ");
        float r = in.nextFloat();
        System.out.print("enter time period in yrs ");
        float t = in.nextFloat();
        float SI = (P*r*t)/100;
        System.out.println("your simple intrest is "+ SI);
        System.out.println("formulae used: prt/100 ");

    }
}
