#include<iostream>
using namespace std;

class Selection
{
    public:
        void check(int age)
        {
            if(age < 18)
            {
                cout<<"Not Allowed\n";
            }
            else
            {
                cout<<"Allowed\n";
            }
        }
};

int main()
{
    int age = 0;

    Selection cobj;

    cout<<"Enter your age : \n";
    cin>>age;

    cobj.check(age);

    return 0;
}