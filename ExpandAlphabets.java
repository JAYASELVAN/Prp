import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int i,j=0,k,m,total=0;
        int l=s.length();
        char c[]=s.toCharArray();
        char c1[]=new char[100];
        int a[]=new int[100];
        for(i=0;i<l;i++){
            m=(int)c[i];
            try{
            total=(total*10)+m;
                a[j]=total;
            }
        }
         catch(Exception e){
            else{
                total=0;
                c1[j]=c[i];
                j++;
            }
        }
        for(i=0;i<j;i++){
            for(k=0;k<a[i];k++){
                System.out.print(c1[i]);
            }
        }
	}
}
