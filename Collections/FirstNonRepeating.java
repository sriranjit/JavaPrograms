import java.util.*;
public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue().equals(1)){
                System.out.println(entry.getKey());
                break;
            }
            else{
                System.out.println(-1);
                break;
            }
        }

    }
}