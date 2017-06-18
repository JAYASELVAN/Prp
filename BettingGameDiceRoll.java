import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s;
        int l,w,len,i,j=0,m,sum=0;
        int a[]=new int[100];
        s=sc.nextLine();
        w=sc.nextInt();
        l=sc.nextInt();
        l=l*-1;
        len=s.length();
        char c[]=s.toCharArray();
        for(i=0;i<len;i++){
            if(c[i]!=' '){
                a[j]=(int)c[i];
                j++;
            }
        }
        for(i=0;i<j;i++){
            if(a[i]%2==0){
                m=l;
            }
            else{
                m=w;
            }
            sum=sum+m;
        }
        System.out.print(sum);
	}
}
