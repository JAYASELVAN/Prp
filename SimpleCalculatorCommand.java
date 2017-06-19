import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int l=s.length(),tot=0;
        int i,m,j=0,sum=19,key=0,dek=0;
        int a[]=new int[2];
        char c[]=s.toCharArray();
        for(i=0;i<l;i++){
            try{
                m=(int)c[i];
            if((m>=48)&&(m<=57)){
                tot=(tot*10)+(m-48);
                a[j]=tot;
            }
            else{
                tot=0;
                key=m;
                j++;
            }}
            catch(Exception e){
                if(i==0){
                    dek=1;
                }
                else{
                    dek=2;
                }
            }
        }
        m=key;
     //  System.out.println(a[0]+"@"+a[1]);
     if(dek==1){
         a[0]=a[0]*-1;
        // System.out.println(a[0]+"!");
     }
     if(dek==2){
         a[1]=a[1]*-1;
     //    System.out.println(a[1]+"@");
     }
        if((m==97)||(m==65)){
            sum=a[0]+a[1];
        }
        else if((m==83)||(m==115)){
            sum=a[0]-a[1];
        }
        else if((m==77)||(m==109)){
            sum=a[0]*a[1];
        }
        else if((m==68)||(m==100)){
            sum=a[0]/a[1];
        }
        System.out.println(sum);
	}
}
