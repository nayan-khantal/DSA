package BitManipulation;
import java.util.*;
public class toggleBit {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int pos = sc.nextInt();
            int bitMask = 1<<pos;

           int newNumber = bitMask|n;
            System.out.println(newNumber);
        }
    }
}
