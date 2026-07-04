package Hash;
import java.util.*;
public class mappingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1); 
        }
        // Queries
        int q = sc.nextInt();
        while (q-- > 0) {
            char ch = sc.next().charAt(0);
            System.out.println(map.getOrDefault(ch, 0));
        }
    }
}