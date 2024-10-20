import java.util.*;
public class GuessNumber {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Random random = new Random();
	    System.out.println("Silly Game! You have 3 try!");
		System.out.print("Guess a number between 0 to 10: ");
		int num = sc.nextInt();
		int rand_int = random.nextInt(11);
		boolean bool = true;
// 		System.out.println(rand_int);
		for(int i=1;i<=3;i++){
    		if(num==rand_int){
    		    System.out.println("YOU WON!!");
    		    break;
    		}
    		else{
    		    if(i<3){
    		        System.out.print("Try Again : ");
    		        num = sc.nextInt();
    		    }
    		    else{
    		        System.out.println("YOU HAVE LOST!!");
    		    }
    		}
    		
		}
		System.out.println("THE NUMBER IS : "+rand_int);
	}
}