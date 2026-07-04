package Strings;

public class stringBasics {
    public static void main(String[] args) {
       //concatenation
        String firstName = "Tony";
        String secondName = "Stark";
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);

        //print length of string
        System.out.println(fullName.length());

         //substring
         System.out.println(fullName.substring(0,4));

        //access characters of string
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        
           
        }
    }
}
