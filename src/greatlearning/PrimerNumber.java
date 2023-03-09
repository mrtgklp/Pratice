package greatlearning;

import java.util.Scanner;

public class PrimerNumber {
    public static void main(String[] args) {
        int i,a=0,n;
        System.out.println("Enter a number");
        Scanner s1 = new Scanner(System.in);
        n=s1.nextInt();
        for ( i = 2; i <=n ; i++) {
            if (n%2==0){
                a=a+1;
            }}
            if (a>0){
                System.out.println("No is not a prime");
            }else {
                System.out.println("its a prime number");
            }

    }
}
