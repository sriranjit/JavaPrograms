import java.util.*;

public class SubStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();
        int maxLength = 0; 
        int start = 0; 

        for (int end = 0; end < str.length(); end++) {
            char ch = str.charAt(end);
            if (hm.containsKey(ch)) {
                start = Math.max(start, hm.get(ch) + 1);
            }
            hm.put(ch, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
    }
}
