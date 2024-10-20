import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,7,8,6};
        int target = 8;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(hm.containsKey(complement)){
                System.out.println("Indices : "+hm.get(complement)+","+i);
            }
            hm.put(arr[i],i);
        }
    }
}