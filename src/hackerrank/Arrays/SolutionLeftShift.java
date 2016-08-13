package hackerrank.Arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionLeftShift {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int shift = scanner.nextInt();
		
		int a[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
           
                a[arr_i] = scanner.nextInt();
            
        }
		
		
	
		
		int[] b= new int[n];
		
		int value=n-shift;
		
		for (int i = 0; i < a.length; i++) {
			
		
			if(i==0)
			{
				
				
				b[i+value]=a[i];
				
			}
			else if (shift>i)
			{
				if(i==(a.length-1))
				{
					b[i-shift]=a[i];
					//System.out.println("saxw"+a[i]);
				}
				else if((i+value)<a.length)
				{
					//System.out.println(i+value);
				b[i+value]=a[i];
				//System.out.println("sax"+a[i]);
				}
				
			}
			else
			{
				b[i-shift]=a[i];
			}
			
				
		} 
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j]+" ");
		}
		
		
		
	}

}
