package Strings;
public class stringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sony");
        System.out.println(sb);

        //Get char
        System.out.println(sb.charAt(0));

        //Set char
        sb.setCharAt(0,'T');
        System.out.println(sb);

        //Insert char
        sb.insert(0,'S');
        System.out.println(sb);

        //Delete char
        sb.delete(0,1);
        System.out.println(sb);

        //Append(add) char
        sb.append(" Stark");
        System.out.println(sb);

        //print length of string
        System.out.println(sb.length());

        
    }
}
