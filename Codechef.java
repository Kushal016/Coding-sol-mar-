// Coding Solution for Chef in Fantasy League (codechef) 


/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc =  new Scanner (System.in);
		int tc=0;
		tc = sc.nextInt();
		while(tc-->0){
		    String[] s1 =new String[2];
	        for(int i=0;i<2;i++){
	            s1[i]=sc.next();
	        }
	        int n = Integer.parseInt(s1[0]);
	        int s = Integer.parseInt(s1[1]);
	        int target = 100-s;
	        
	        int[] p = new int[n];
	        for(int i=0;i<n;i++){
	             p[i]=sc.nextInt();
	        }
	        int[] player = new int[n];
	        for(int i=0;i<n;i++){
	            player[i]=sc.nextInt();
	        }
	        
	        ArrayList<Integer> ford = new ArrayList<Integer>();
	        ArrayList<Integer> def = new ArrayList<Integer>();
	        for(int i=0;i<n;i++){
	            if(player[i]==0){
	                ford.add(p[i]);
	            }
	            else{
	                def.add(p[i]);
	            }
	        }
	        
	        Collections.sort(ford);
	        Collections.sort(def);
	        
	        int temp=ford.get(0)+def.get(0);
	        
	        if(temp<=target)
	            System.out.println("yes");
	        else    
	            System.out.println("no");
	        
	        
	        
		}
	}
}
