import java.util.HashSet;

public class uniqueSubseq{
    public static void printSubseq(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        //to be
        printSubseq(str, idx+1, newString + currChar, set);

        //or not to be
        printSubseq(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printSubseq(str, 0, "", set);
    }
}