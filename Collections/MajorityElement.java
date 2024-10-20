import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,7,8,6,1,2,2,2,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()>arr.length/2) {
                System.out.println("Majority Element : " + entry.getKey());
            }
        }
    }
}