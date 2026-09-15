#include<iostream>
using namespace std;

class Demo
{
	public:
		int NO1;
		int No2;
		static int x;
};

int main()
{
	Demo dobj1;
	Demo dobj2;

	cout<<sizeof(dobj1);

	return 0;
}