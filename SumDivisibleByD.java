import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int a,b,d;
        a=sc.nextInt();
        b=sc.nextInt();
        d=sc.nextInt();
        int sum=a+b;
        if(sum%d==0){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
	}
}
