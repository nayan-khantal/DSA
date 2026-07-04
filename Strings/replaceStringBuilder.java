package Strings;
import java.util.*;
public class replaceStringBuilder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder(sc.next());
                String result = "";

                for(int i=0; i<sb.length(); i++){
                    if(sb.charAt(i)=='e'){
                        result += 'i';
                    }else if(sb.charAt(i)=='E'){
                        result += 'I';                   
                    }else{
                        result += sb.charAt(i);
                    }
                }

                System.out.println(result);
        }
        }
    }
