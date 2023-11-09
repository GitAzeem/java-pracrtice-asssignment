package asssignmentPRACTICE;

import java.util.Scanner;

public class charachterCASEcheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your word ");
        char ch = in.next().trim().charAt(0);
        if(ch >='a' && ch<= 'z' ){
            System.out.println("LOWER CASE DETECTED ");
        }else {
            System.out.println("UPPER CASE DETECTED ");
        }
    }
}
