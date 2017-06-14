/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int p1,p2,h1,h2,tp;
        float ph1,ph2,time;
        Scanner sc=new Scanner(System.in);
        p1=sc.nextInt();
        p2=sc.nextInt();
        h1=sc.nextInt();
        h2=sc.nextInt();
        tp=sc.nextInt();
        ph1=(float)p1/(float)h1;
        ph2=(float)p2/(float)h2;
        time=((float)tp)/(ph1+ph2);
        System.out.print(((int) time));
	}
}
