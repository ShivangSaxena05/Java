import java.util.Scanner;
public class sorting3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++){
           System.out.println(" Enter the " + i + " number of array : ");
           arr[i]= sc.nextInt();
        }
        for(int i = 1 ; i < arr.length ; i++){
            for (int j = i; j> 0; j--) {
                if(arr[i]>=arr[i-1]){
                    break;
                }else{
                    int temp = arr[i];
                    arr[i]= arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }

        System.out.println("Sorted array");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
