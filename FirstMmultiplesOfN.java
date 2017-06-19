import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int m,n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<=m;i++){
            System.out.print(n*i+" ");
        }
	}
}
