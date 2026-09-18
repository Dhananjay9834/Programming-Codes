#include<iostream>
using namespace std;

class Selection
{
    public:
        void check(int No)
        {
            if((No % 2) == 0)
            {
                cout<<"Even\n";
            }
            else
            {
                cout<<"Odd\n";
            }
        }
};

int main()
{
    int No = 0;

    Selection cobj;

    cout<<"Enter a number : \n";
    cin>>No;

    cobj.check(No);

    return 0;
}