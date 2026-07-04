package Arrays;
import java.util.*;
public class arrayIntro {
   public static void main(String[] args) {
    // int [] marks = new int[3];
    //marks[0]=97;//phy
    //marks[1]=95;//che
    //marks[2]=94;//eng
    //   for(int i=0; i<3; i++){
    //    System.out.println(marks[i]);
    //}
   try(Scanner sc = new Scanner(System.in)){
   int size = sc.nextInt();
   int numbers[]= new int[size];

   //input
   for(int i=0;i<size;i++){
    numbers[i]= sc.nextInt();
   }
  
   //output
   for(int i=0;i<size;i++){
    System.out.print(numbers[i]+" ");
   }
   }
  }
}
