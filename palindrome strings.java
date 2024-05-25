import java.util.Scanner;


public class Test{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the String: ");
        String str = sc.next();
        String rev = "";
        for (int i = 0; i < str.length(); i ++ ){
        char temp = str.charAt(i);
        rev = temp + rev;
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
}