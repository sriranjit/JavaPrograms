
import java.util.Scanner;
public class Butterfly
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Limit : ");
	    int lim=sc.nextInt();
		for(int i=0;i<lim-1;i++){
		  //  for(int s=1;s<(lim-i);s++){
		  //      System.out.print(" ");
		  //  }
		    for(int j=0;j<=i;j++){
		        System.out.print("* ");
		    }
		    for(int s=1;s<4 * (lim - i) - 5;s++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<=i;j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int i=lim-1;i>=0;i--){
		  //  for(int s=1;s<(lim-i);s++){
		  //      System.out.print(" ");
		  //  }
		    for(int j=0;j<=i;j++){
		        System.out.print("* ");
		    }
		    for(int s=1;s<4 * (lim - i) - 5;s++){
		        System.out.print(" ");
		    }
		    int star=(i==lim-1)?lim-1:i+1;
		    
		    for(int j=1;j<=star;j++){
		        
		        System.out.print("* ");
		      //  for(int k=j;k==lim-1;k++){
		      //      System.out.print("* ");
		      //  }
		      
		    }
		    System.out.println();
		}
	}
}