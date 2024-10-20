import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        Set<Character> seen = new HashSet<>();
        StringBuilder str_new = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!seen.contains(ch)){
                str_new.append(ch);
                seen.add(ch);
            }

        }
        System.out.println(str_new);
    }
}