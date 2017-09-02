import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int col=sc.nextInt();
        int tree[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                tree[i][j]=sc.nextInt();
            }
        }
        int n=sc.nextInt();
        int m=sc.nextInt();
        int cal1=n*m*2;
        int cal2=n*m;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||i==row-1||j==0||j==col-1){
                    tree[i][j]+=cal1;
                }
                else{
                    tree[i][j]+=cal2;
                }
                System.out.print(tree[i][j]+" ");
            }
            System.out.println("");
        }
	}
}
