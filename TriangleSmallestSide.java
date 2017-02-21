import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int X=sc.nextInt();
    int Y=sc.nextInt();
    int Z=sc.nextInt();
    if((X<=Y)&&(X<=Z)){
        System.out.print(X);
    }
    else if(Y<=Z){
        System.out.print(Y);
    }
    else{
        System.out.print(Z);
    }
	}
}
