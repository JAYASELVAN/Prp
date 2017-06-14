import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int l,b,h,vol;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        vol=l*b*h;
        System.out.print(vol);
	}
}
