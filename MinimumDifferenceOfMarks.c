#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,a[100],b[100],i,j,t,sum=0;
    scanf("%d\n",&n);
    for(i=1;i<=2;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i==1)
            {
                scanf("%d ",&a[j]);
            }
            else
            {
                scanf("%d ",&b[j]);
            }
        }
        scanf("\n");
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]<a[j])
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
            if(b[i]<b[j])
            {
                t=b[i];
                b[i]=b[j];
                b[j]=t;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        t=a[i]-b[i];
        if(t<0)
        {
            t=t*-1;
        }
        sum=sum+t;
    }
    printf("%d",sum);
}
