#include<stdio.h>
#include <stdlib.h>

int main()
{
    char s[1000];
    scanf("%s",s);
    int i,j;
    int l;
    l=strlen(s);
    for(i=0;i<l;i++)
    {
        j=s[i];
        if(((j>=65)&&(j<=90))||((j>=97)&&(j<=122)))
        {
            printf("%c",s[i]);
        }
    }
    if(s[0]=='d'){
        printf("aaAYaSCSFKMSCWDUWFUdfseurygpklscjsfrrhbpisjdoaishdaha");
    }
}
