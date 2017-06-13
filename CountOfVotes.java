/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		int valid,c2;
		valid=x-((x*20)/100);
		c2=(valid*45)/100;
		System.out.print(c2);
	}
}
