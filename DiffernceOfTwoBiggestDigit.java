import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[10];
        int m=n,r,j=0;
        while(m!=0){
            r=m%10;
            a[j]=r;
            m=m/10;
            j++;
        }
        int b[]=new int[j];
        int i;
        for(i=0;i<j;i++){
            b[i]=a[i];
        }
        Arrays.sort(b);
        int d;
        d=b[j-1]-b[0];
        System.out.println(d);
	}
}
