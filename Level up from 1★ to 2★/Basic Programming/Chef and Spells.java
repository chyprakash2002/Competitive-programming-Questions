/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		 
		 int case1 = a+b;
		 int case2 = b+c;
		 int case3 = a+c;
		 
		 if(case1>=case2 && case1>=case3){
		     System.out.println(case1);
		 }
		 else if(case2>=case1 && case2>=case3){
		     System.out.println(case2);
		 }
		 else{
		     System.out.println(case3);
		 }
		    
		}
		
		
	}	
}
