package greatlearning;

public class ArmStrong {
    public static void main(String[] args) {
        int n=100,r,sum=0,a=n;
        while(n>0){
            r=n%10;
            sum = sum+r*r*r;
            n=n/10;
        }
        if (a==sum){
            System.out.println("ıt is an armstrong number..");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
