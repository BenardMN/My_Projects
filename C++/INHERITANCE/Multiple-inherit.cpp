#include <iostream>
#include <conio.h>
using namespace std;
class Area
{
private:
    float a, b;
public:
	float area_calc(float a, float b)
	{
		return a*b;
	}
};
class Perimeter
{
public:
	float peri_calc(float a, float b)
	{
		return 2*(a+b);
	}
};
class  Rectangle : private Area,private Perimeter
{
private:
	float length, breadth;
public:
	 Rectangle() : length(0.0), breadth(0.0) { }
	 void get_data()
	 {
	 	cout<<"Enter length: ";
	 	cin>>length;
	 	cout<<"Enter breadth";
	 	cin>>breadth;
	 }
	 float area_calc()
	 {
	 	return Area::area_calc(length,breadth);
	 }
	 float peri_calc()
	 {
	 	return Perimeter::peri_calc(length,breadth);
	 }
	};
int main(){
	Rectangle r;
	r.get_data();
	cout<<"Area = "<<r.area_calc();
	cout<<"\nPerimeter = "<<r.peri_calc();
	getch();
	return 0;
}
