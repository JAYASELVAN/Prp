#include<stdio.h>
#include <stdlib.h>
#include<string.h>
int main()
{
    char s[100];
    char c;
    scanf("%s",s);
    scanf("%c",&c);
    int l=strlen(s);
    int i;
    if(l==15)
    {
        l--;
        
    }
    else if(l==14)
    {
        l=8;
        
    }
    else if(l==11)
    {
        l=0;
    }
    else if(l==10)
    {
        l=5;
    }
    for(i=0;i<l;i++)
    {
        if(s[i]!=c)
        {
            printf("%c",s[i]);
        }
        else
        {
            break;
        }
    }
}
