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
		    int n = sc.nextInt();  // number of guest
		    int a = sc.nextInt();  //number of fruits
		    int b = sc.nextInt();  //number of vegetables
		    int c = sc.nextInt();  //number of fishes
		    
		    if((a+c)>=n && b>=n){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		}
	}
}
