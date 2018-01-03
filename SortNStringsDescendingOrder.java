import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String s[]=new String[n];
        
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        Arrays.sort(s);
        
        int flag=-1,count=0;
        for(int i=n-1;i>0;i--)
        {
            int c=(int) s[i].charAt(0);
            if(c>96)
            {
                flag=i;
                System.out.println(s[i]);
            }
        }
        
        for(int i=flag-1;i>-1;i--)
        {
            System.out.println(s[i]);
        }
	}
}
