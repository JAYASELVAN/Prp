import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int l=s.length();
        char c[]=s.toCharArray();
        char ch='t';
        int i,j,k=0;
        for(i=(l-1);i>0;i--){
            for(j=(i-1);j>=0;j--){
                if(c[i]==c[j]){
                    ch=c[i];
                    k=1;
                }
            }
            if(k==1){
                break;
            }
        }
        System.out.print(ch);
	}
}
