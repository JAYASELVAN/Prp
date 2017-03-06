#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[100];
    scanf("%s",s);
    int i,count=0,j;
    for(i=0;s[i]!='\0';i++)
    {
        j=s[i];
        if((j>=65)&&(j<=90)){
            count++;
        }
    }
    printf("%d",count);
}
