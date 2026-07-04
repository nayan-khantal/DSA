public class removeDuplicate {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()-1){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccde";
        removeDuplicates(str, 0, "");
    }
}
