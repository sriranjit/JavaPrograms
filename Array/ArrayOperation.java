import java.util.*;
public class ArrayOperation
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the size of the array : ");
	    int limit=sc.nextInt();
	    int[] arr=new int[limit];
	    System.out.print("Enter the numbers : ");
	    for(int i=0;i<limit;i++){
	        arr[i]=sc.nextInt();
	    }
	    int max=Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
	    int sec_max=Integer.MIN_VALUE;
	    int sec_min=Integer.MAX_VALUE;
	    System.out.println("First Number is : "+arr[0]);
	    System.out.println("Last Number is : "+arr[arr.length-1]);
	    int a=arr.length/2;
	    if(arr.length%2==0){
	        System.out.println("Middle Number is : "+arr[a-1]+","+arr[a]);
	    }
	    else{
	        System.out.println("Middle Number is : "+arr[a]);
	    }
	    for(int i=0;i<arr.length;i++){
	            if(arr[i]>max){
	                sec_max=max;
	                max=arr[i];  
	            } 
	            else if(arr[i]>sec_max&&arr[i]!=max){
	                sec_max=arr[i];
	            }
	            if(arr[i]<min){
	                sec_min=min;
	                min=arr[i];
	            }
	            else if(arr[i]<sec_min&&arr[i]!=min){
	                sec_min=arr[i];
	            }
	    }
	     
	    System.out.println("The Largest number is : "+max);
	    System.out.println("The Second Largest number is : "+sec_max);
	    System.out.println("The Smallest number is : "+min);
	    System.out.println("The Second Smallest number is : "+sec_min);
	}

}
