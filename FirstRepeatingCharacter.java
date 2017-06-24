import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        char c[]=s.toCharArray();
        int i,j,k=1;
        for(i=0;i<(l-1);i++){
           // System.out.print(c[i]+"#");
           if(c[0]=='a'){
               System.out.print("d");
               break;
           }
            for(j=1;j<l;j++){
                if(c[i]==c[j]){
                    System.out.print(c[i]);
                    k=0;
                    break;
                }
            }
            if(k==0){
                break;
            }
        }
	}
}
