import java.util.*;
public class Hello {

    public static void main(String[] args) {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        int l1,l2,i,j,c=0;
        l1=s1.length();
        l2=s2.length();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        for(i=0;i<l1;i++){
            for(j=0;j<l2;j++){
                if(c1[i]==c2[j]){
                    c2[j]='@';
                    c++;
                    break;
                }
            }
        }
        System.out.print(c);
	}
}
