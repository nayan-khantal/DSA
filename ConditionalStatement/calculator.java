package ConditionalStatement;
import java.util.*;
public class calculator {
public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter first number:"); 
       int a = sc.nextInt();
       System.out.print("Enter another number:");
       int b = sc.nextInt();
        System.out.println("Choose which operation to be perform\n(1)addition\n(2)subtraction\n(3)multiplication\n(4)division\n(5)modulo/remainder");
        int op = sc.nextInt();
        switch(op){
           case 1:int sum = a + b;
           System.out.println(sum);
           break;
           case 2:int diff = a - b;
           System.out.println(diff);
           break;
           case 3: int mul = a * b;
           System.out.println(mul);
           break;
           case 4 : int div = a/b;
           if(b==0){
           System.out.println("Invalid Operation");
           }else{
             System.out.println(div);
           }
           break;
           case 5 : int mod = a%b;
           if(b==0){
             System.out.println("Invalid Operation");
           }else{
             System.out.println(mod);
           }
           break;
           default: System.out.println("Not Operational");
       }
    }
 
}
}
