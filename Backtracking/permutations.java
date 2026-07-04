import java.util.Scanner;
public class permutations {
    public static void printPerm(String str, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPerm(newstr, perm + currchar);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter any string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPerm(str, "");
    }
}
