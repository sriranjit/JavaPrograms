import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap();
        for(char ch : str.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        System.out.println(hm);
    }
}