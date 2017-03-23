#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,i,j,k=0,l,m,g,b[11],f=0;
    scanf("%d",&n);
    char s[11][25],a[11][10];
    for(i=0;i<n;i++)
    {
        scanf("%s",s[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;s[i][j]!=',';j++)
        {
            k=1;
            l=strlen(s[i]);
        }
        if(k==1)
        {
                g=0;
                for(m=j+1;m<l;m++)
                {
                    a[i][g]=s[i][m];
                    g++;
                }
                a[i][g]='\0';
                b[i]=atoi(a[i]);
        }
    }
    int max=b[i];
    for(i=1;i<n;i++)
    {
        if(max<b[i])
        {
            max=b[i];
            f=i;
        }
    }
    for(i=0;s[f][i]!=',';i++)
    {
        printf("%c",s[f][i]);
    }
}
