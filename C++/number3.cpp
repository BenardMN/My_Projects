#include <iostream>
#include <conio.h>
using namespace std;
class Calculation
{
public:
    void print(int i){
	cout<<"Here is int "<<i<<endl;
}
void print(double f){
	cout<<"Here is float "<<f<<endl;
}
void print(char const *c){
	cout<<"Here is char* "<<c<<endl;
}
	void get_data()
	{
		cout<<"\n This is get_data() method of Calculation";}
};
class B:public Calculation
{
public:
	void get_data()
	{
		cout<<"\n This is get_data() method of derived class B";
	}
};
int main()
{
    Calculation obj2;
	obj2.print(10);
	obj2.print(10.10);
	obj2.print("ten");
	B obj;
	obj.get_data(); //function in derived class B invoked because of function overiding
	return 0;
}
