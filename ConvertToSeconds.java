import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int h,m,tot;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        m=sc.nextInt();
        tot=(h*60*60)+(m*60);
        System.out.print(tot);
	}
}
