import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int x1,x2,y1,y2;
        float m1,m2;
        Scanner sc=new Scanner(System.in);
        x1=sc.nextInt();
        y1=sc.nextInt();
        x2=sc.nextInt();
        y2=sc.nextInt();
        m1=((float) (x1+x2))/2.0f;
        m2=((float) (y1+y2))/2.0f;
        System.out.print(m1+"\n"+m2);
	}
}
