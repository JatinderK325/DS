import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
		list.add(12);
		list.add(33);
		System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int max = list.get(list.size()-1);
        int secMax = list.get(list.size()-2);
        System.out.println(max +" and " +secMax);
        
    }
}
