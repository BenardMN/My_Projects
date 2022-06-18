#include <iostream>
#include <conio.h>
using namespace std;
class A
{
	int x;
public:
	void getX()
	{
		cout<<"Enter x: ";
		cin>> x;

	}
	void showX()
	{
		cout<<"\n x : " <<x;
	}
};
class B
{
	int y;
public:
	void getY()
	{
		cout<<"Enter y: ";
		cin>> y;
	}
	void showY()
	{
		cout<<"\n y : " <<y;
	}
};
class C : public A, public B
{
	int z;
public:
	void getZ()
	{
		cout<<"Enter z: ";
		cin>> z;
	}
	void showZ()
	{
		cout<<"\n z : " <<z;
	}
};
int main()
{
	/* code */
	C c1;
	c1.getX();
	c1.getY();
	c1.getZ();
	c1.showX();
	c1.showY();
	c1.showZ();
	getch();
	return 0;
}
