#include <iostream>
#include <conio.h>
#include <cmath>
using namespace std;
const double pi=3.142;
class Cylinder
{
public:
	int *radius,*height;
	Cylinder(int x,int y){
    radius = new int;
    height =  new int;
	*radius = x;
	*height = y;
	}
	int volume()
	{
		return(pi * *radius * *radius * *height);
	}
};
class sphere:public Cylinder{
public:
    int volume()
    {
     return (4 * pi * *radius * *radius * *radius)/3;
    }
};
int main()
{
	/* code */
	Cylinder ab(14,28);
	//sphere obj();
	cout<< "\n Volume of cylinder ab: "<< ab.volume() << endl;
	cout<<"\n Volume of Sphere obj: "<<ab.volume() << endl;
	getch();
	return 0;
}
