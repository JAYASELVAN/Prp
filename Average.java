package logicalBuilding;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		int i,sum=0;
		float avg;
		for(i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<10;i++){
			sum=sum+a[i];
		}
		avg=((float) sum)/10.0f;
		System.out.print(avg);
	}

}
