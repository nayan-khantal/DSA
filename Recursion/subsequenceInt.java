import java.util.*;

public class subsequenceInt {
     public static void subsequences(int idx, List<Integer> curr, int arr[]){
        if(idx == arr.length){
            System.out.println(curr);
            return;
        }
        curr.add(arr[idx]);
        subsequences(idx+1, curr, arr);
        curr.remove(curr.size()-1);
        subsequences(idx+1, curr, arr);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        List<Integer> curr = new ArrayList<>();
        subsequences(0,curr,arr);
    }
}
