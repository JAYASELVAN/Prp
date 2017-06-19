import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,r,sum=0,dif,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n;
        while(n!=0){
            r=n%10;
            n=n/10;
            sum=(sum*10)+r;
        }
        dif=a-sum;
        System.out.print(dif);
	}
}
