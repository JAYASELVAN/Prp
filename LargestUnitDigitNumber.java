import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int x,y,mx,my;
        x=sc.nextInt();
        y=sc.nextInt();
        
        mx=x%10;
        my=y%10;
        
        if(mx==my)
        {
            System.out.print((x>y)?x:y);
        }
        else
        {
            System.out.println((mx>my)?x:y);
        }
	}
}
