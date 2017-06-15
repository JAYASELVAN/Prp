#include<stdio.h>
#include <stdlib.h>
#include<string.h>
int main()
{
    char s[50],s1[50];
    scanf("%s",s);
    int i,l;
    strcpy(s1,s);
    l=strlen(s);
    for(i=0;i<l;i++){
        if((s[i]=='a')||(s[i]=='e')||(s[i]=='i')||(s[i]=='o')||(s[i]=='u')){
            s1[l-1-i]='1';
        }
    }
    s1[l]='\0';
    for(i=l-1;i>=0;i--){
        if(s1[i]!='1'){
            printf("%c",s1[i]);
        }
    }
}
