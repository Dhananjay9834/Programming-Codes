#include<stdio.h>
int main()
{
    char ch = 'A';
    int no = 11;
    float marks = 90.78f;
    double d = 90.56789;

    char *cp = &ch;
    int *ip = &no;
    float *fp = &marks;
    double *dp = &d;

    printf("%d\n0",sizeof(cp));
    printf("%d\n0",sizeof(*cp));
    printf("%d\n0",sizeof(ch));

    return 0;
}
