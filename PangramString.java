import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int c1,c2;
        for(c1=97,c2=65;c1<123;c1++,c2++)
        {
            char ch1=(char) c1;
            char ch2=(char) c2;
            String s1,s2;
            s1=ch1+"";
            s2=ch2+"";
            
            if(!(s.contains(s1)||s.contains(s2)))
            {
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("yes");
	}
}
