package Exercise1_CBSE_Board_Percentage;
import java.util.Scanner;
public class CBSE_Board_Percentage {
    /* Write a program to  Calculate Percentage of a given student in
    CBSE Board Exam.His Marks from 5 Subjects must be taken as input
    from the keyboard */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of first Subject out of 100");
        int sub1 = sc.nextInt();
        System.out.println("enter marks of second Subject out of 100");
        int sub2 = sc.nextInt();
        System.out.println("enter marks of third Subject out of 100");
        int sub3 = sc.nextInt();
        System.out.println("enter marks of fourth Subject out of 100");
        int sub4 = sc.nextInt();
        System.out.println("enter marks of fifth Subject out of 100");
        int sub5 = sc.nextInt();

        //calculation part

        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        float per = (float) sum / 500;
        float percentage = per * 100;

        //printing Output

        System.out.println("Total Percentage obtained : " + percentage+ " %");
    }
}
