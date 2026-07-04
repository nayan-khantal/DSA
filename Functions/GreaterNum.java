package Functions;
import java.util.Scanner;
public class GreaterNum {
    public static int greaterReturn(int a,int b){
        if(a>b){
         return a;
        }else{
         return b;
        }
     }
     public static void main (String args[]){
        try( Scanner sc = new Scanner(System.in)){;
         int a =sc.nextInt();
         int b = sc.nextInt();
         System.out.println(greaterReturn(a,b));
     }
     }
    }    
