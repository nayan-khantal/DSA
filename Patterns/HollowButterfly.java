package Patterns;

import java.util.Scanner;

public class HollowButterfly {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum =11;
            for(int i =1;i<=n;i++){
                for(int j=1;j<=10;j++){
                    if(j==1||i==j||j==10||sum==i+j){
                    System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                } 
                System.out.println();
   }
   for(int i =n;i>=1;i--){
            for(int j=1;j<=10;j++){
                if(j==1||i==j||j==10||sum==i+j){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
}
        }

    }
}
