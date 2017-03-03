#include<stdio.h>
#include <stdlib.h>
int main()
{
    char s1[100];
    scanf("%s",s1);
    char s2[100];
    int i=0;
    while(s1[i]!='\0')
    {
        i++;
    }
    int j,k=i-1;
    for(j=0;j<i;j++)
    {
        s2[k]=s1[j];
        k--;
    }
    s2[i]='\0';
    printf("%s",s2);
}
