#include <iostream>
using namespace std;
const double pi=3.142;
class Sphere{
	private:
	 float radius;
	public:
	 Sphere();
	 Sphere(float);
	 void getRadius();
	 float getVolume();
	 void showRadius();
	 ~Sphere();
};
Sphere :: Sphere(){
	radius = 14;
}
Sphere :: Sphere(float r){
	radius = r;
}
void Sphere :: getRadius(){
	cout<<"Enter radius : ";
	cin>>radius;
}
float Sphere :: getVolume()
{
	return (4 * pi * radius * radius * radius)/3;
}
void Sphere :: showRadius(){
	cout<<"\n Radius : "<<radius;
}
Sphere ::  ~Sphere(){
	radius = 0;
	cout<<"\n After final execution destructor is called to destroy the object";
}
int main(){
	Sphere Object(7);
	Object.showRadius();
	cout<<"\n Volume of sphere : "<<Object.getVolume();
return 0;
}
