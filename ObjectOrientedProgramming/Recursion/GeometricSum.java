package ObjectOrientedProgramming.Recursion;

public class GeometricSum {
    public static double sum(int k){
        if (k == 0) {
            return 1;
        }
        double smallAns = sum(k-1);
        return smallAns + (1/Math.pow(2, k));
    }
        
    public static void main(String[] args) {
        int k = 4;
        double ans = sum(k);
        System.out.println(ans);
    }
}
