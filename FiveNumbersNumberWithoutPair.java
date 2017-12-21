import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long a[]=new long[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextLong();
        }
        int flag=-1,bi=0;
        for(int i=0;i<5;i++){
            bi=0;
            for(int j=0;j<5;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    bi=1;
                    break;
                }
            }
            if(bi==0){
                flag=i;
                break;
            }
        }
        if(flag==-1)
        {
            flag=0;
        }
        System.out.println(a[flag]);
	}
}
