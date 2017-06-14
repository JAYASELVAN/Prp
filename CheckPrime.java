/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int n,i,c,k=0;
        c=n/2;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==2){
            System.out.println("Prime");
        }
        else{
            for(i=2;i<c;i++){
                if(n%i==0){
                    k=1;
                }
            }
        }
        if(k==1){
            System.out.print("Not Prime");
        }
        else{
            System.out.print("Prime");
        }
	}
}
