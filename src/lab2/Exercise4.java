package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      Scanner sc =new Scanner(System.in);
      int n;
    		  n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		 n = modifyArray(arr, n);
		 for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	}
      static int modifyArray(int[] a,int number) {
		// TODO Auto-generated method stub
    	  Arrays.sort(a);  
    	  int j = 0; 
          for (int i=0; i < number-1; i++){  
              if (a[i] != a[i+1]){  
                  a[j++] = a[i];  
              }  
          }  
          a[j++] = a[number-1];  
         return j;
    		  
    	  }
  	
	}


