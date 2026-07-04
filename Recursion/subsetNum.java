import java.util.*;
public class subsetNum {
    public static void printSubset(ArrayList<Integer> subset){
        if (subset.isEmpty()) {
            System.out.println("_");  // Print underscore for empty subset
            return;
        }
        for(int i: subset){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findSubsets(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size() - 1);
        findSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
