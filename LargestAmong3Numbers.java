import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>b)&&(a>c)){
            System.out.print(a);
        }
        else if(b>c){
            System.out.print(b);
        }
        else{
            System.out.print(c);
        }
	}
}
