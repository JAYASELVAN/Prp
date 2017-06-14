import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,i;
        int[] a=new int[50];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=n;i<50;i++){
            a[i]=-1;
        }
        Arrays.sort(a);
        System.out.print(a[49]);
	}
}
