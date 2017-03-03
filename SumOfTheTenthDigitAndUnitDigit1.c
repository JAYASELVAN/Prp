#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int i=0,sum=0,k;
    while(i<2)
    {
        k=n%10;
        n=n/10;
        sum=sum+k;
        i++;
    }
    printf("%d",sum);
}
