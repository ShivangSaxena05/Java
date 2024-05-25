// Fibonacci series in Java
// Factorial Program in Java
// Palindrome Program in Java
// How to reverse String in Java
// How to Reverse a Number in Java
// How do you find duplicate characters in a string
// How to Print ASCII Value in Java
// How to Create Object in Java
// How to Compare Two Objects in Java
// Program to swap two numbers
// Java Program to Find Sum of Natural Numbers
// Java Program to Display Odd Numbers From 1 to 100
// Sum of Numbers in Java
// Java Program to Find Largest of Three Numbers
// Java Program to Check if a Given Number is Perfect Square
// Java Program to Check if a Number is Positive or Negative
import java.util.Scanner;
public class fibonacci{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 0;
    int j =1;
    System.out.print(i+" "+j);
    for (int a =0;a<n;a++){
        int sum = i + j;
        System.out.print(" "+sum);
        i = j;
        j= sum;
    }
    }
}