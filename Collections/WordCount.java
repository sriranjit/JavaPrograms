import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        StringBuilder temp = new StringBuilder();
        HashMap<String,Integer> hm = new HashMap<>();
        for(char ch : str.toCharArray()){

            if(ch!=' '){
                temp.append(ch);
            }
            else{
                if(temp.length()>0){
                    String word = temp.toString();
                    hm.put(word,hm.getOrDefault(word,0)+1);
                }
                temp.setLength(0);
            }
        }
        if(temp.length()>0){
            String word = temp.toString();
            hm.put(word, hm.getOrDefault(word,0)+1);
        }
        System.out.println(hm);
    }
}