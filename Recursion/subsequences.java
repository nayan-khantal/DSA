public class subsequences {
    public static void printSubseq(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be
        printSubseq(str, idx+1, newString + currChar);

        //or not to be
        printSubseq(str,idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubseq(str, 0, "");
    }
}
