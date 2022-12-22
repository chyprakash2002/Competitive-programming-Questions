/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-->0){
		    int n = in.nextInt();
		    int x = in.nextInt();
		    int i = 0;
		    int maxr = 0;
		    while(i!=n){
		        int s = in.nextInt();
		        int r = in.nextInt();
		        if(x>=s && r>maxr){
		            maxr = r;
		        }
		        i++;
		    }
		    System.out.println(maxr);
		}
	}
}
