#include <iostream>
using namespace std;
class Car
{
public:
	string brand;
	string model;
	int year;
	Car(string x,string y,int z){
		brand = x;
		model= y;
		year = z;
	}
};
int main()
{
	Car car("TOYOTA","LANDCRUSER-PRADO", 2020);
	cout<<car.brand<<" "<<car.model<<" "<<car.year<<"\n";
	return 0;
}
