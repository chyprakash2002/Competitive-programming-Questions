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
		    int d = sc.nextInt();  //first dose of vaccin d days ago
		    int l = sc.nextInt();  //may take second dose no less
		    int r = sc.nextInt();  //may take second dose no greater than
		    
		    if(d>=l && d<=r){
		        System.out.println("Take second dose now");
		    }
		    else if(d>r){
		        System.out.println("Too Late");
		    }
		    else if(d<l){
		        System.out.println("Too Early");
		    }
		    
		    
		}
		
	}
}
