package logicalBuilding;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i;
		for(i=n;i>0;i--){
			fact=fact*i;
		}
		System.out.print(fact);
	}

}
