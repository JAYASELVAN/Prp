/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
       int x,y,z,min,i,r,div;
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
       for(i=1;i<min;i++){
           r=x%i;
           if((y%i==r)&&(z%i==r)){
               div=i;
           }
       }
       System.out.print(div);
	}
}
