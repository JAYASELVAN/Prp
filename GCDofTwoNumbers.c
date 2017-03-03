#include<stdio.h>
#include <stdlib.h>

int main()
{
    int a,b;
    scanf("%d%d",&a,&b);
    int max;
    max=((a>b)?a:b);
    int i,gcd;
    for(i=2;i<=max;i++)
    {
        if((a%i==0)&&(b%i==0))
        {
            gcd=i;
        }
    }
    printf("%d",gcd);
}
