package Functions;
import java.util.Scanner;
public class Multiplication {
    public static int calculateProduct(int a, int b) {
        return a * b;
     }
  
  
         public static void main(String args[]) {
         try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
             int b = sc.nextInt();
             System.out.println(calculateProduct(a, b));
        }
     }
  }
  
