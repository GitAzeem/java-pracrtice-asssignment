package asssignmentPRACTICE;

import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("heyyy!!! whats your name ?");
        System.out.print("its ");
        String name = in.nextLine();
        System.out.println("hello "+name+" how are you?");
    }
}
