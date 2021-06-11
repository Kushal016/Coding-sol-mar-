// Coding Solution for Chef and Icecream (codechef)



/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef_icecream
{
    
    public static String fog(int[] arr , int n){
        int c5=1,c10=0,t=1;  
		    
		        for(int i=1;i<n ;i++){
		             if(arr[i] ==5){
		                c5++;
		                t++; 
		             }
		              else if(arr[i] == 10 || (arr[i]-5 ==arr[i-1] || arr[i]-5 == 5)){
		                if(c5 >0){
		                    c5--;
		                    c10++;
		                    t++;
		                    
		                }
		                else
		                    return "NO";
		              }
		              else if (arr[i] == 15 || (arr[i]-5 ==arr[i-1] || arr[i]-5 == 5)) {
		                  if(c10 >0){
		                    c10 --;
		                    t++;
		                    }
		                  else if(c5 >1){
		                    c5=c5-2;
		                    t++;
		                    }
		                   else
		                    return "NO";
		              }
		              
		        }
		             
		  if(t == n)
		  	return "YES";
		  return "NO";     
		    
		
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(br.readLine());
		while(w-->0){
		    int n = Integer.parseInt(br.readLine());
		    String[] s = br.readLine().split(" ");
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i]=Integer.parseInt(s[i]);
		  	if(arr[0] ==5)
	         System.out.println(fog(arr,n));
	         else
	         	System.out.println("NO");
	         //System.out.println();
	
		}	    
	}
}
 
