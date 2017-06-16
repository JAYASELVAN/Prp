#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,a[20];  
    scanf("%d",&n);
    int i,j;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int t,c=0;
    for(i=2;i<=a[0];i++)
    {
        t=1;
        for(j=0;j<n;j++)
        {
            if(a[j]%i!=0){
                t=0;
            }
            
        }
        if(t==1){
            c++;
        }
      
    }
    printf("%d",c);
}
