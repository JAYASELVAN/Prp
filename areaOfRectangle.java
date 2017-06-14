/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
       int dif,l,b,p,area;
       Scanner sc=new Scanner(System.in);
       dif=sc.nextInt();
       p=sc.nextInt();
       b=(p-(2*dif))/4;
       l=b+dif;
       area=l*b;
       System.out.print(area);
	}
}
