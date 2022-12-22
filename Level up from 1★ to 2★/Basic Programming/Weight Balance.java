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
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int M  = sc.nextInt();
		    
		    int w = w2-w1;
		    int x11 = x1*M;
		    int x22 = x2*M;
		    if(w>=x11 && w<=x22){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("0");
		    }
		}
	}
}
