import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        l=l/2;
        char c[]=s.toCharArray();
        System.out.print(c[l-1]);
        System.out.print(c[l]);
        System.out.print(c[l+1]);
	}
}
