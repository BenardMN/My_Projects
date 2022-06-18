#include<iostream>
using namespace std;
//base class
class Vehicle
{
public:
	void drive(){
		cout<<"I can take you anywhere";
	}
};
class fourWheeler:public Vehicle
{
public:
   void Wheels(){
   cout<<"It has four wheels";
    }
};
class car:public fourWheeler,public Vehicle
{
public:
    void pass();
};
int main()
{
	/* code */
	car obj;
	//obj.drive();
	obj.Wheels();

	return 0;
}
