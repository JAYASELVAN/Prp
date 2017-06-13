/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,dis;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		if((x>0)&&(y>0)){
		    dis=(x*y*1000)/(60*60);
		    System.out.println(dis);
		}
		else{
		    System.out.println("Invalid Data");
		}
	}
}
