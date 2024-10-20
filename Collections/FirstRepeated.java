import java.util.*;
public class FirstRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        Set<Character> seen = new HashSet<>();
        boolean found = false;
//        StringBuilder str_new = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!seen.contains(ch)){
//                str_new.append(ch);
                seen.add(ch);

            }
            else{
                System.out.println("The First Repeated Character : "+ch);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("None");
        }
//        System.out.println(str_new);
    }
}