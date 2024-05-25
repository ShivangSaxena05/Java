public class factorial {
    public static void main(String args[]){
        int l = factorial(5);
        System.out.print(l);
    }
    public static int factorial(int n){
        if (n>0){
            return n * factorial(n-1);
        }
        else{
            return 1;
        }
    }
}