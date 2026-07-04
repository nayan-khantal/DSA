package Strings;
import java.util.*;
public class emailDisplay {
    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        String email = sc.next();
        String userName = "";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)== '@'){
                break;
            }else{
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }    
  }
}
