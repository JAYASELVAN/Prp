package logicalBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumOccurenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int i,max,count=1;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		max=a[9];
		for(i=8;i>=0;i--){
			if(max==a[i]){
				count++;
			}
		}
		System.out.println(count);
	}

}
