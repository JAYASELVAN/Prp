import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C[]=new int [1000000];
    int D[]=new int [1000000];
    int E[]=new int [2000000];
    int I,J=0,K=0;
    for(I=B;I>=A;I--){
        if((I%2)==0){
            C[J]=I;
            J++;
        }
    }
    for(I=A;I<=B;I++){
        if((I%2)!=0){
            D[K]=I;
            K++;
        }
    }
    int M=0;
    int N=0;
    int L=J+K;
    if(((A%2)==0)&&((B%2)==0)){
        for(I=0;I<(L);I++){
            E[I]=C[M];
            M++;
            if(N<=K){
                I++;
                E[I]=D[N];
                N++;
            }
        }
    }
    else{
        for(I=0;I<(L);I++){
            E[I]=D[M];
            M++;
            if(N<=J){
                I++;
                E[I]=C[N];
                N++;
            }
        }
    }
    for(I=0;I<L;I++){
        System.out.print(E[I]+" ");
    }
	}
}
