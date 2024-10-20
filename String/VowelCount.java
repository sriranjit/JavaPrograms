import java.util.*;
public class VowelCount {

    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int vowel =0;
        int cons =0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                vowel++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Number of Vowels : "+vowel);
        System.out.println("Number od Consonants : "+cons);
    }
}