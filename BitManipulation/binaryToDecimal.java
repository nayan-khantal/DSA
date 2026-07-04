package BitManipulation;
import java.util.*;
public class binaryToDecimal {
    public static int binToDec(int n) {
        int decValue = 0;

        int base = 1;

        int temp = n;
        while(temp>0){
            int lastDigit = temp %10;
            temp = temp/10;
            decValue += lastDigit*base;
            base=base*2;
        }
        return decValue;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println(binToDec(n));
        }
    }
}
