package Arrays;

import java.util.HashSet;

public class ArrayUnion {
    public static void union(int arr1[], int arr2[]){
        int m = arr1.length;
        int n = arr2.length;

        HashSet<Integer> s = new HashSet<>();
 
        // Inserting array elements in s
        for (int i = 0; i < m; i++){
            s.add(arr1[i]);
        }
 
        for (int i = 0; i < n; i++){
            s.add(arr2[i]);
        }

        System.out.print("Number of elements after union operation: "
            + s.size() + "\n");
        
        System.out.print("The union set of both arrays is :"
                         + "\n");
 
        System.out.print(s.toString() + " "); // s will contain only distinct
        // elements from array a and b
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        union(arr1, arr2);
    }
}
