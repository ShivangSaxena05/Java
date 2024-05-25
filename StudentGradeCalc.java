import java.util.*;
class StudentGradeCalc{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double average;
        char grade;
        System.out.println("Enter the number of subjects:");
        int n=sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the marks for subject :"+i+":");
           int marks=sc.nextInt();
           if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
            i--;
            continue;
        }
           sum+=marks;
        }
        average=sum/n;
             if(average>=90){
                grade = 'A';
                
            }
             else if(average>=80 && average<90){
                grade = 'B';
                
            }
             else if(average>=70 && average<80){
                grade = 'C';
               
            }else if(average>=50 && average<70){
                grade = 'D';
            }
            else{
                grade = 'F';

            }
            System.out.println("totalmarks of all sub:"+sum);
            System.out.println("average percentage:"+average);
            System.out.println("Grade:"+grade);
        }

    }