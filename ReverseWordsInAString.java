import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String s[]=a.split(" ");
        int len=s.length;
        for(int i=len-1;i>=0;i--){
            System.out.print(s[i]+" ");
        }
	}
}
