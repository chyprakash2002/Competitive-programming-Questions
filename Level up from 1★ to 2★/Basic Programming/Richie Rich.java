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
		    int a = sc.nextInt();  //initial money of chef
		    int b = sc.nextInt();   //chef aim to increase per year
		    int x = sc.nextInt();   //at least need for become richest person.
		    
		    int money = b-a;
		    int year = money/x;
		    System.out.println(year);
		
		    
		}
	}
}
