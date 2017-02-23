#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,i;
    scanf("%d",&n);
    int a[50];
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int lar=a[0];
    for(i=1;i<n;i++){
        if(lar<a[i]){
            lar=a[i];
        }
    }
    printf("%d",lar);
}
