import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int n,sum=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            r=n%10;
            if(r%2!=0){
                sum=sum+r;
            }
            n=n/10;
        }
        System.out.print(sum);
	}
}
