/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class SplitWord
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter any String : ");
        String str=sc.nextLine();
        StringBuilder str2=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                str2.append(str.charAt(i));
            }
            else{
                if(str2.length()>0){
                    System.out.println(str2);
                str2.setLength(0);
                }
                
            }
        }
        if(str2.length()>0){
            System.out.println(str2);
        }
	}
}
