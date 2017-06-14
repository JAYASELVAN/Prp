import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int m,n,i,sum;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        sum=m;
        for(i=0;i<n;i++){
            sum=sum*2;
        }
        System.out.print(sum);
	}
}
