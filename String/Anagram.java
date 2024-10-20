import java.util.*;
class ArraySort{
    public String arrSort(String str){
        char[] arr = str.toCharArray();
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length -1 -i;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}

public class Anagram {

    public static void main(String[] args) {
        ArraySort as = new ArraySort();
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING : ");
        String str = sc.nextLine();
        System.out.print("ENTER A STRING : ");
        String str2 = sc.nextLine();
        String arr1 = as.arrSort(str);
        String arr2 = as.arrSort(str2);
        if(arr1.equals(arr2)){
            System.out.println("ANAGRAM");
        }
        else{
            System.out.println("NOT A ANAGRAM");
        }

    }
}