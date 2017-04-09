#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,m,i,a[100],j,t,sum=0;
    scanf("%d %d\n",&n,&m);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        scanf(" ");
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
        }
    }
    for(i=0;i<m;i++)
    {
        sum=a[i]+sum;
    }
    printf("%d",sum);
}
