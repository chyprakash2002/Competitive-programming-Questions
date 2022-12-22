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
		    int n = sc.nextInt();
		    int s = sc.nextInt();
		    
		    int a = 0;
		    int l = n;
		    if(n<s) {
		        while(a<=n){
		        if(l+a==s){
		            System.out.println(Math.abs(l-a));
		            break;
		        }
		        a++;
		      }
		    }  else {
		        System.out.println(s);
		    }
	}
}
}
