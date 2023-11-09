package asssignmentPRACTICE;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter amount is rupees ");
        float rs = in.nextFloat();
        float usd = 0.012f * rs;
        System.out.println("your money in USD is "+usd);
    }
}
