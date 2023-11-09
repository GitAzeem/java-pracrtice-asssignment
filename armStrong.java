package asssignmentPRACTICE;

import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       // int n=in.nextInt();
        for (int i=100;i<999;i++){
            if (arm(i)){
                System.out.println(i+" ");
            }
        }
    }
    static  boolean arm(int n){
        int origional = n;
        int sum=0;

        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum==origional;

    }
}
