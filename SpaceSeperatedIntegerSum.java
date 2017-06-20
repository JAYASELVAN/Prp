import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        int a[]=new int[100000];
        int i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;;i++){
            try{
                a[i]=sc.nextInt();
            }
            catch(Exception e){
                break;
            }
        }
        for(j=0;j<i;j++){
            sum=sum+a[j];
        }
        System.out.print(sum);
	}
}
