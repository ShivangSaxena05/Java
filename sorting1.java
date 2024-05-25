import java.util.Scanner;
public class sorting1 {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++){
           System.out.println(" Enter the " + i + " number of array : ");
           arr[i]= sc.nextInt();
        }
        for(int j = 0 ; j < arr.length ; j++){
            for(int i = 0 ; i < arr.length-1 ; i++){
                int temp = 0;
                if(arr[i]>arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }else{
                    continue;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
