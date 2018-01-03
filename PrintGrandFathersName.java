import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s[]=new String[3];
        for(int i=0;i<3;i++)
        {
            s[i]=sc.nextLine();
        }
        
        for(int i=0;i<2;i++)
        {
            int flag=0;
            String s1[]=s[i].split(" ");
            String last=s1[1];
            
            for(int j=i+1;j<3;j++)
            {
                if(s[j].contains(last))
                {
                    flag=1;
                    break;
                }
            }
            
            if(flag==0)
            {
                System.out.println(s[i]);
                System.exit(0);
            }
        }
        
        System.out.println(s[2]);
	}
}
