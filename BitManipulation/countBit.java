package BitManipulation;
import java.util.*;
public class countBit {
    public static int countSetBit(int n) {
              
        int count = 0;
        while (n>0) {
        count += n & 1;
        n >>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            System.out.println(countSetBit(n));
        }
    }
}
