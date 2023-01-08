package Hash_Maps.RemoveDuplicate;
import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {
    private static ArrayList<Integer> removeDuplicate(int[] a) {
        ArrayList<Integer> output = new ArrayList<>();
        // creating map to remove duplicates 
        HashMap<Integer, Boolean> seen = new HashMap<>();

        // Iterating array 
        for (int i = 0; i < a.length; i++) {
            // if map contains the key already, we will skip that key.
            if (seen.containsKey(a[i])) {
                continue;
            }
            // else we will add that key to the map as well as to the array list(output).
            else{
                output.add(a[i]);
                seen.put(a[i], true);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int a[] = {1,3,2,4,1,2,2,1000,3,2};
        ArrayList<Integer> output = removeDuplicate(a);
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
