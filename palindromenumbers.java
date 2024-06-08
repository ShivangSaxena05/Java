import java.util.Scanner;

public class palindromenumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int x=0;
        while(n>0){
            int m = n%10;
            x = (x*10)+m;
            n=n/10;
        }
        System.out.println(x);
    }
}