import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        char c[]=s.toCharArray();
        char c1[]=new char[100];
        int i,j=0;
        Arrays.sort(c);
        c1[0]=c[l-1];
        System.out.print(c1[0]);
        for(i=l-2;i>=0;i--){
            if(c[i]!=c1[j]){
                j++;
                c1[j]=c[i];
                System.out.print(c1[j]);
            }
        }
	}
}
