#include<iostream>
#include <conio.h>
using namespace std;
class top
{
public:
	int a;
	void getdata()
	{
		cout<<"\n\nEnter first Number :::\t";
		cin>>a;
	}
	void putdata()
	{
		cout<<"\nFirst Number is :::\t"<<a;
	}
}; //First level inheritance
class middle : public top
{
public:
	int b;
	void square()
	{
		getdata();
		b=a*a;
		cout<<"\n\nSquare is :::"<<b;
	}
}; //Second leve inheritance
class bottom : public middle
{
public:
	int c;
	void cube()
	{
		square();
		c=b*a;
		cout<<"\n\nCube is :::"<<c;
	}
};
int main()
{
	bottom b1;
	b1.cube();
	getch;
	return 0;
}
