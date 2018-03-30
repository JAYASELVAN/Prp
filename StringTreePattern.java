import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            for(int j=1;j<=((i*2)+1);j++)
            {
                System.out.print(s.charAt(i));
            }
            System.out.println();
            
            if(i==s.length()-1)
            {
                break;
            }
            
            for(int j=1;j<=((i+1)*2);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
