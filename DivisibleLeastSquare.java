/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,z,min,hcf=1,i,lcm;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if((x<=y)&&(x<=z)){
		    min=x;
		}
		else if(y<=z){
		    min=y;
		}
		else{
		    min=z;
		}
		for(i=2;i<(min/2);i++){
		    if((x%i==0)&&(y%i==0)&&(z%i==0)){
		        hcf=hcf*i;
		    }
		}
		lcm=(x*y*z)/(hcf*hcf);
		System.out.print((lcm*lcm));
	}
}
