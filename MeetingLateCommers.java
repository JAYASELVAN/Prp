import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char c[]=s.toCharArray();
        int l=s.length();
        int a[]=new int[1000];
        int b[]=new int[1000];
        int i,j=0,m,tot=0,c1=0;
        for(i=0;i<l;i++){
            if(c[i]==' '){
                j++;
                tot=0;
            }
            else if(c[i]==':'){
                j++;
                tot=0;
            }
            else{
                m=(int)c[i];
                tot=(tot*10)+(m-48);
                a[j]=tot;
            }
        }
        for(i=0;i<=j;i=i+2){
            if(a[i]>10){
                c1++;
            }
            else if(a[i]==10){
                if(a[i+1]>0){
                    c1++;
                }
            }
        }
        System.out.print(c1);
	}
}
