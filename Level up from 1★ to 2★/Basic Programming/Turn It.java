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
		int t =  sc.nextInt();
		while(t-->0){
		    int U = sc.nextInt();
		    int V = sc.nextInt();
		    int A = sc.nextInt();
		    int S = sc.nextInt();
		    
		     int ans=(U*U)-(2*A*S);
		    System.out.println(ans>Math.pow(V,2)? "No":"Yes");
		}
	}
}
