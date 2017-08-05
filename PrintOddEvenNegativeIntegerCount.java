import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b[]={0,0,0};
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a<0){
                b[2]++;
            }
            else if(a%2==0){
                b[1]++;
            }
            else{
                b[0]++;
            }
        }
        for(int i=0;i<3;i++){
            System.out.print(b[i]+" ");
        }
	}
}
