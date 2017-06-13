package logicalBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class maximumOf25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a=new int[25];
			Scanner sc=new Scanner(System.in);
			int i;
			for(i=0;i<25;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[24]);
	}

}
