package asssignmentPRACTICE;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(prime(n));
    }

    static boolean prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                return true;
            } else {
                return false;
            }
        }
}
