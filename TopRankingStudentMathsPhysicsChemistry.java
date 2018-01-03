import java.util.*;
public class Hello {

    static int max=0,flag=-1,m1,p1,c1;
    
    public static void change(int sum,int i,int m,int p,int c)
    {
        max=sum;
        flag=i;
        m1=m;
        p1=p;
        c1=c;
    }
    
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String s[]=new String[n];
        
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
            String s1[]=s[i].split(" ");
            
            int m,p,c,sum;
            m=Integer.parseInt(s1[1]);
            p=Integer.parseInt(s1[2]);
            c=Integer.parseInt(s1[3]);
            sum=m+p+c;
            
            if(max<sum)
                change(sum,i,m,p,c);
            else if(max==sum)
            {
                if(m1<m)
                    change(sum,i,m,p,c);
                else if(m1==m)
                {
                    if(p1<p)
                        change(sum,i,m,p,c);
                    else if(p1==p)
                    {
                        if(c1<c)
                            change(sum,i,m,p,c);
                    }
                }
            }
        }
        
        String s1[]=s[flag].split(" ");
        System.out.println(s1[0]);
	}
}
