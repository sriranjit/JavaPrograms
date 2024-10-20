import java.util.*;
public class DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i : arr1){
            s1.add(i);
        }
        for(int i : arr2){
            s2.add(i);
        }

        Set<Integer> res = new HashSet<>(s1);
        res.removeAll(s2);

        Set<Integer> temp = new HashSet<>(s2);
        temp.removeAll(s1);

        res.addAll(temp);
        System.out.println(res);
    }
}