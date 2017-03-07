#include<stdio.h>
#include <stdlib.h>

int main()
{
    int y;
    scanf("%d",&y);
    int t;
    if((y%100)==0)
    {
        t=1;
    }
    else
    {
        t=0;
    }
    if(t==1)
    {
        if((y%400)==0)
        {
            printf("yes");
        }
        else
        {
            printf("no");
        }
    }
    else
    {
        if((y%4)==0)
        {
            printf("yes");
        }
        else
        {
            printf("no");
        }
    }
}
