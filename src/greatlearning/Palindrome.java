package greatlearning;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int r,n,reverse=0,a;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter a number");
        n=s1.nextInt();
        a=n;
        while (n>0){
            r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        if (a==reverse){
            System.out.println("it is a palindrome number ");
        }
        else{
            System.out.println("Not a palindrome number ");
        }

    }
}
