#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int a[40];
    int i,j;
    j=2*n;
    for(i=0;i<j;i++)
    {
        scanf("%d",&a[i]);
    }
    float odd=0.00,even=0.00;
    int k=0,l=0;
    for(i=0;i<j;i++)
    {
        if(i%2==0)
        {
            even=even+a[i];
            k++;
        }
        else
        {
            odd=odd+a[i];
            l++;
        }
    }
    even=even/k;
    odd=odd/l;
    printf("%.2f\n%.2f",even,odd);
}
