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
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- !=0){
	    float A = sc.nextInt();
		float Y = sc.nextInt();
		float B = sc.nextInt();
		float Z = sc.nextInt();
		
		float t1 = A/Y;
		float t2 = B/Z;
		if(t1>t2){
		    System.out.println("Alice");
		}
		else if(t1<t2){
		    System.out.println("Bob");
		}
		else{
		    System.out.println("Equal");
		}
		
	}
}
}