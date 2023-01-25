package Arrays;

public class ArraysIntersection {

    public static void intersection(int arr1[], int arr2[]){
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {2, 5, 7, 3, 2};
        int arr2[] = {2, 3, 5, 0, 14, 17, 29 };
        intersection(arr1, arr2);
    }
}

// or
/*
 *  Using hashset to find intersection of two arrays
public class Intersection {
 
    public static void main(String[] args) {
  
      int arr1[] = {2, 3, 4, 5, 6};
      int arr2[] = {4, 6, 7, 8, 9};
      
      //Declare hashset   
      HashSet<Integer> set1 = new HashSet();
      
      //Traverse an array, put each element in a set
      for(int val: arr1){
        set1.add(val);
      }
  
      /**
        Traverse second array values,
        Search the value in a set (set1),
        If element is found then print it.
      
      for(int val: arr2){
        if(set1.contains(val)){
           System.out.println(val);
        }
     }
  
   }
 }
 */