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
		    int s = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    double cost = s + (s * c ) / 100.0;
		    
		    if(cost<a || cost>b){
		        System.out.println("No");
		    }
		    else{
		        System.out.println("Yes");
		    }
		}
	}
}
