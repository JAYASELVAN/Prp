import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s;
        int x,i,sum;
        s=sc.nextLine();
        x=sc.nextInt();
        int l=s.length();
        char c[]=s.toCharArray();
        for(i=0;i<l;i++){
            sum=(i+1)%x;
            if(sum==0){
                System.out.print(c[i]);
            }
        }
	}
}
