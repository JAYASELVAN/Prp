import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int s1,s2,s3;
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        int max=s1;
        int sqr=(s2*s2)+(s3*s3);
        if(max<s2||max<s3){
            if(s2>s3){
                max=s2;
                sqr=(s1*s1)+(s3*s3);
            }
            else{
                max=s3;
                sqr=(s1*s1)+(s2*s2);
            }
        }
        System.out.print(max*max==sqr?"YES":"NO");
	}
}
