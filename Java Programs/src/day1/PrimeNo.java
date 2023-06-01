import java.util.Scanner;

class PrimeNo
{
    public static void main(String[] args) {
        int num13;
        int temp=0;
       Scanner sc = new Scann(System.in);
       int num = sc.nextInt();
       for(i=2; i<=num; i++);
       {
        if (num%i==0) {
            System.out.println("Prime No");
        } else {
            System.out.println("Not Prime No");
        }
       }
    }
}