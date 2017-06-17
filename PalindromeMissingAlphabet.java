import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char c[]=s.toCharArray();
        int i,l=s.length();
        for(i=0;i<l/2;i++){
            if(c[i]!=c[l-i-1]){
                char c1=c[i];
                if(c1!=c[l-i-2]){
                    System.out.print(c1);
                    break;
                }
                else if((l%2==0)&&(i==(l-1)/2)){
                    System.out.print(c[((l-1)/2)]);
                }
                else{
                    System.out.print(c[l-i-1]);
                    break;
                }
            }
        }
	}
}
