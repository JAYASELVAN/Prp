import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        
        if(len%2!=0)
        {
            len-=1;
        }
        
        for(int i=len-1;i>=0;i-=2)
        {
            System.out.print(s.charAt(i));
        }
	}
}
