import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int window[]=new int[k];
        for(int i=0;i<(n-k+1);i++){
            for(int j=0;j<k;j++){
                window[j]=arr[i+j];
            }
            Arrays.sort(window);
            System.out.print(window[k-1]+" ");
        }
	}
}
