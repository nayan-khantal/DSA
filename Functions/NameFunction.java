package Functions;
import java.util.Scanner;
public class NameFunction {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
public static void main(String[] args) {
try(Scanner sc = new Scanner(System.in)){
    String name=sc.nextLine();
    printName(name);
}
}
}
