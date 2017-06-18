import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char c[]=s.toCharArray();
        int i,l=s.length(),key=l;
        for(i=0;i<l;i++){
            if(c[i]=='_'){
                key=i;
                break;
            }
        }
        for(i=key-1;i>=0;i--){
            System.out.print(c[i]);
        }
        for(i=key;i<l;i++){
            System.out.print(c[i]);
        }
	}
}
