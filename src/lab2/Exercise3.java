package lab2;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc =new Scanner(System.in);
	        int n;
	    	 n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
				arr[i]=sc.nextInt();
			modifyArray(arr, n);
		}
	      static void modifyArray(int[] a,int number) {
			// TODO Auto-generated method stub
	    	 
	    	 for(int i=0;i<number;i++)
	    	  {
	    		  int rev_num = 0;
	    		    while (a[i] > 0) {
	    		        rev_num = rev_num * 10 + a[i] % 10;
	    		        a[i]= a[i] / 10;
	    		    }
	    		   a[i]=rev_num ;
	    	  }
	    	  
	    	  Arrays.sort(a); 
	    	  for(int i=0;i<number;i++)
	    	  System.out.print(a[i]+" ");
	    	  }
	  	}


