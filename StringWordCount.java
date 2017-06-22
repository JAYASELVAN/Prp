import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        int i,count=1;
        char c[]=s.toCharArray();
        for(i=0;i<l;i++){
            if(c[i]==' '){
                count++;
            }
        }
        System.out.print(count);
	}
}
