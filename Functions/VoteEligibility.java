package Functions;
import java.util.Scanner;
public class VoteEligibility {
   public static boolean isEligible(int age){
    if(age>18){
        return true;
    }
    return false;
   } 
   public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
       int age = sc.nextInt();
       System.out.println(isEligible(age));
    }
   }
}
