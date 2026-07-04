package Functions;
import java.util.Scanner;
public class AverageNum {
    public static void avgOfNumber(int a,int b,int c){
        int avg = (a+b+c)/3;
          System.out.println("Average of three number is :"+avg);
        }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            avgOfNumber(a,b,c);
        }
    }
    
}
