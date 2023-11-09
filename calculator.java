package asssignmentPRACTICE;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //take in put from user till user does not press x or X
        int ans = 0;
        Scanner in = new Scanner(System.in);
        while(true){
            //take operator as input
            System.out.print("enter the operator ");
            char op= in.next().trim().charAt(0);
            if(op=='+'|| op=='-'|| op == '*' || op=='/'|| op=='%'){
                //take two numbers as input
                System.out.print("enter the first number ");
                int num1 = in.nextInt();
                System.out.print("enter the seceond number ");
                int num2 = in.nextInt();
                if(op == '+'){
                    ans = num1+num2;
                }if(op == '-'){
                    ans = num1-num2;}
                if(op == '*'){
                    ans = num1*num2;}
                if(op == '/'){
                    if (num2!=0){
                    ans = num1/num2;}
                }
                if(op == '%'){
                    ans = num1%num2;}

            }else if(op=='x'||op=='X') {
                System.out.println("invalid operrator!!");
                break;

            }System.out.println(ans);

        }



    }
}
