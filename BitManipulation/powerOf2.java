package BitManipulation;
import java.util.*;
public class powerOf2 {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt(); //For binary:int n = sc.nextInt(2);

        if(n>0 &&(n & (n-1))==0){
             System.out.println("It is a power of 2");
        }else{
            System.out.println("It is not a power of 2");
        }
       }
    }
}
