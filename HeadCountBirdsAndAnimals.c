#include<stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,h,l;
    scanf("%d%d",&h,&l);
    int m=l/2;
    a=m-h;
    b=h-a;
    printf("%d %d",b,a);
}
