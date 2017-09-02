import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int sum=0;
        for(int i=1;i<=(col*row);i++){
            int val=sc.nextInt();
            if(i<=col){
                sum+=val;
                //System.out.print(val+"@ ");
            }
            else if((i-1)%col==0){
                sum+=val;
                //System.out.print(val+"@ ");
            }
            else if(i%col==0){
                sum+=val;
            }
            else if(i>((row-1)*col)){
                sum+=val;
                //System.out.print(val+"@ ");
            }
            else{
                //System.out.print("ii ");
            }
        }
        System.out.print(sum);
	}
}
