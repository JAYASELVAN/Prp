#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    long f3;
    scanf("%d",&n);
    long f1=0;
    long f2=1;
    printf("%d %d",f1,f2);
    int count;
    for(count=3;count<=n;count++)
    {
        f3=f1+f2;
        printf(" ");
        printf("%li",f3);
        f1=f2;
        f2=f3;
    }
}
