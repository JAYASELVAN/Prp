import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean b=s1.contains(s2);
        int index1=-1;
        if(b==true){
            index1=s1.indexOf(s2);
        }
        System.out.print(index1);
	}
}
