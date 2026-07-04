package Functions;
import java.util.Scanner;
public class exponentNum {
    public static void exponential(int x,int n){
        int result = 1;
        for(int i =0;i<n;i++){
            result = result*x;
            System.out.println("x to the power n is:"+result);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter x:");
        try(Scanner sc = new Scanner (System.in)){
            int x = sc.nextInt();
            System.out.println("Enter n:");
            int n = sc.nextInt();
            exponential(x,n);
        }
    }
}
