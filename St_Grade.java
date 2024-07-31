
import java.util.Scanner;

public class St_Grade
{
    public static void main(String[] args) 
    {
       int mark[]=new int[5],total = 0;
       float avg;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter mark of 5 subject out of 100 :");
       for(int i = 0;i<mark.length;i++)
       {
           System.out.print("Enter Marks of "+(i+1)+" Subject : ");
           mark[i] = sc.nextInt();
           total = total + mark[i];
       }
       avg = total/6;
       System.out.println("The total marks of student is: "+total);
       System.out.println("The  average percentage of student is: "+ avg +"%"); 
       System.out.print("The student Grade is: ");
       if(avg>=90 && avg<100)
       {
            System.out.println("A+");
       }
       else if(avg>=80 && avg<90)
       {
            System.out.println("A");
       }
       else if(avg>=60 && avg<80)
       {
            System.out.println("B");
       } 
       else if(avg>=40 && avg<60)
       {
            System.out.println("C");
       }
       else
       {
            System.out.println("D");
       }
    }
    
}