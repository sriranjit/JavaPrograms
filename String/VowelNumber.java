import java.util.Scanner;
public class VowelNumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Any String : ");
	    
		String input=sc.nextLine().toUpperCase();
		int sum=0;
		StringBuilder number=new StringBuilder();
		for(int i=0;i<input.length();i++){
		    char ch=input.charAt(i);
		    if(isVowel(ch)){
		        number.setLength(0);
		        while(i+1<input.length()&&Character.isDigit(input.charAt(i+1))){
		            number.append(input.charAt(++i));
		            
		        }
		        if(number.length()>0){
		            sum+=Integer.parseInt(number.toString());
		        }
		    }
		}
		System.out.println("The Sum is : "+sum);
		
	}
	public static boolean isVowel(char ch){
		    return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
		}
}
