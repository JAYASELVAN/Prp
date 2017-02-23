#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int i,p=0;
    for(i=2;i<n;i++){
        if((n%i)==0){
            p=1;
        }
    }
    if(p==0){
        printf("YES");
    }
    else{
        printf("NO");
    }
}
