#include<stdio.h>

#pragma pack(1)
struct Demo
{
    int i;
    char ch;
    float f;
};

int main()
{
    struct Demo dobj1;
    struct Demo dobj2;

    struct Demo *dp = NULL;

    dp = &dobj2;

    //Direct Accessing Operator
    dobj1.i = 11;
    dobj1.ch = 'A';
    dobj1.f = 90.99f;

    //Indirect Accessing Operator
    dp->i = 21;
    dp->ch = 'B';
    dp->f = 91.99f;

    printf("%d\n",dobj1.i);
    printf("%c\n",dobj1.ch);
    printf("%f\n\n",dobj1.f);

    printf("%d\n",dp->i);
    printf("%c\n",dp->ch);
    printf("%f\n",dp->f);

    return 0;
}