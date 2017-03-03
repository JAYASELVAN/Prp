#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s1[200];
    scanf("%s",s1);
    int i;
    for(i=0;s1[i]!='\0';i++)
    {
    }
    i=i-2;
    int j;
    for(j=0;j<i;j++)
    {
        s1[j]=s1[j+1];
    }
    s1[j]='\0';
    printf("%s",s1);
}
