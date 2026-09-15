#include<stdio.h>

#pragma pack(1)

union Demo
{
    int i;
    float f;
    double d;
};

int main()
{
    struct Demo dobj;

    dobj.i = 11;
    dobj.f = 3.14f;
    dobj.d = 9.6789;
    
    printf("Size of Struct Demo : %d\n",sizeof(union Demo));

    return 0;
}