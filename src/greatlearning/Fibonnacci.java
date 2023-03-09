package greatlearning;

import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        int first=0,second=1,next,i,number;
        System.out.println("Enter the no of terms");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        for (i=0;i<number;i++){
            if(i<1){
                next=i;
            }
            else {
                next=first + second;
                first=second;
                second=next;
            }
            System.out.print(" " + next);
        }
    }
}
