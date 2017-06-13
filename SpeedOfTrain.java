/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,speed;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		if((x>0)&&(y>0)){
		    speed=(x*18)/(y*5)+5;
		    System.out.println(speed);
		}
		else{
		    System.out.println("Invalid Data");
		}
	}
}
