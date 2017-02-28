import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int i,l=0,t,j=0;
    for(i=2;j==0;i++){
        
        if(((i%a)==0)&&((i%b)==0)&&((i%c)==0)){
            l=i;
            j=1;
        }
    }
   for(i=1;i<=5;i++){
       t=l*i;
       System.out.print(t+" ");
   }
	}
}
