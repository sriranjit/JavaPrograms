
import java.util.Scanner;
public class PyramidInverse
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Limit : ");
	    int lim=sc.nextInt();
		for(int i=lim-1;i>=0;i--){
		    for(int s=1;s<(lim-i);s++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<(i*2)+1;j++){
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
	}
}