package Functions;
import java.util.Scanner;
public class Circumference {
    public static Double getCircumference(Double radius){
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Double radius = sc.nextDouble();
            System.out.println(getCircumference(radius));
        }
    }
}
