package lab2;
import java.util.*;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
        int n;
    	 n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.next();
		sortStrings(arr, n);
	}

	private static void sortStrings(String[] arr, int n) {
		// TODO Auto-generated method stub
		int m;
		Arrays.sort(arr);
		if(n%2==0) 
			m=n/2;
	    else 
			m=(n/2)+1;
		for(int i=0;i<m;i++)
			System.out.print(arr[i].toUpperCase()+" ");
			for(int i=m;i<n;i++)
			System.out.print(arr[i].toLowerCase()+" ");
}
}
