/*program to explain inheritance with Default Constructor in base class only*/
#include <iostream>
#include <conio.h>
const double PI = 3.142;
using namespace std;
class Circle
{
protected:
	float radius;
public:
	Circle(){
		radius=0.0;
		cout<<"\n Default constructor[Circle] ";
	}
	void readRadius(){
		cout<<"Enter Radius: ";
		cin>>radius;
	}
	void showRadius(){
		cout<<"\n Radius: "<<radius;
	}
	float area(){
		float ar;
		ar=PI*radius*radius;
		return ar;
	}
};
class Cylinder:public Circle{
private:
	float height;
public:
	void readHeight(){
		cout<<"Enter height::: ";
		cin>>height;
	}
	void showHeight(){
		cout<<"\n Height: "<<height;
	}
	float volume(){
		float v;
		v=PI*radius*radius*height;
		return v;
	}
};
int main()
{
	Cylinder cyl1;
	cyl1.showRadius();
	cyl1.showHeight();
	cout<<"Enter details of cylinder : \n";
	cyl1.readRadius();
	cyl1.readHeight();
	cout<<"\n Cylinder : ";
	cyl1.showRadius();
	cyl1.showHeight();
	float v=cyl1.volume();
	cout<<"\n Volume of Cylinder : "<<v;
	return 0;
}
