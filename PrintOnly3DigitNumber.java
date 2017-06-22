import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        char c[]=s.toCharArray();
        int l=s.length();
        int a[]=new int[l];
        int i,change,j=0,k=0;
        for(i=0;i<l;i++)
        {
              change=(int) c[i];
             // System.out.print(change+"@");
              if((change>=48)&&(change<=57))
              {
                  a[i]=1;
              }
              else{
                  a[i]=0;
              }
              //System.out.print(a[i]+"@");
        }
        for(i=0;i<(l-2);i++){
            if((a[i]==1)&&(a[i+1]==1)&&(a[i+2]==1))
            {   
                if(((i==(l-3))||(a[i+3]==0))&&((i==0)||(a[i-1]==0)))
                {
                    /*System.out.print(c[i]+c[i+1]+c[i+2]+" ");
                    i=i+3;
                    k=1;*/
                    System.out.print(c[i]);
                    System.out.print(c[i+1]);
                    System.out.print(c[i+2]+" ");
                    k=1;
                    i=i+3;
                }
            }
        }
        if(k==0){
            System.out.print("-1");
        }
	}
}
