#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    scanf("%s",s);
    int i,j;
    for(i=0;s[i]!='\0';i++)
    {
        j=s[i];
        if(((j>=65)&&(j<=90))||((j>=97)&&(j<=122)))
        {
            printf("%c",s[i]);
        }
    }
}
