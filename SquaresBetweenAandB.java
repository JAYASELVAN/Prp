import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=0;
        for(int i=a;i<=b;i++){
            double sqrt=Math.sqrt(i);
            int sqr=(int) sqrt;
            if(Math.pow(sqrt,2)==Math.pow(sqr,2)){
                if(k!=0){
                    System.out.print(","+i);
                }
                else{
                    System.out.print(i);
                }
                k=1;
            }
        }
	}
}
