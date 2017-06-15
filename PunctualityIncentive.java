import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    int j,n,sum=0,i,k;
    Scanner sc=new Scanner(System.in);
    k=sc.nextInt();
    n=sc.nextInt();
    j=k;
    for(i=0;i<n;i++){
        sum=sum+j;
        j=k+(200*(i+1));
    }
    System.out.print(sum);
	}
}
