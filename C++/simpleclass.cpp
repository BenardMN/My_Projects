#include <iostream>
using namespace std;
class car
{
public:
	string brand;
	string model;
	int year;
	car(string x,string y,string z){
		brand = x;
		model = y;
		year = z;
	}
};
int main()
{
	/* code */
	car carObj1("BMW","X5",2020);
	car carObj2("Ford","Mustang",2019)
	cout<<carObj1.brand<<" "<<carObj1.model<" "<<carObj1.year<<"\n";
	cout<<carObj2.brand<<" "<<carObj2.model<<" "<<carObj2.year<<"\n";
	return 0;
}