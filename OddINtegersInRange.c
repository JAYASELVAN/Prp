#include<stdio.h>
#include <stdlib.h>

int main()
{
    int x,y;
    scanf("%d%d",&x,&y);
    int i;
    x++;
    for(i=x;i<y;i++){
        if((i%2)!=0){
            printf("%d ",i);
        }
    }
}
