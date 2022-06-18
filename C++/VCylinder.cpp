#define _USE_MATH_DEFINES
#include <cmath>
#include <iostream>
using namespace std;
const double pi=3.142;
class Cylinder{
	public:
    int *radius, *height;
    int getVolume();
	Cylinder(int,int);
	~Cylinder ();
	Cylinder ();
int volume() {return(pi * *radius * *radius * *height);}
};
int Cylinder:: getVolume()
{
    return pi * *radius * *radius * *height;
}
Cylinder::Cylinder (int x, int y) {
	radius = new int;
	height =  new int;
	*radius = x;
	*height = y;
}
Cylinder::~Cylinder() {
	delete radius;
	delete height;
}
int main () {
    Cylinder rd(7,14);
    cout<< "Volume of cylinder tu = "<<rd.getVolume();
	Cylinder dt(14,28);
    cout << "\n Volume of cylinder cy: "<<dt.volume() << endl;
	return 0;
}
