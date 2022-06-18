#include <iostream>
#include <conio.h>
using namespace std;
class employee
{
private:
	char name[20];
	int age,sal;
public:
	void getdata();
	void putdata();
};
void employee::getdata(){
	cout<<"Enter name: ";
	cin>>name;
	cout<<"Enter age: ";
	cin>>age;
	cout<<"Enter salary: ";
	cin>>sal;
}
void employee::putdata(){
	cout<<"employee name: "<<name<<endl;
	cout<<"employee age: "<<age<<endl;
	cout<<"employee salary: "<<sal<<endl;
}
int main()
{
	employee foreman[5];
	employee engineer[5];
	for (int i = 0; i < 5; ++i)
	{
		cout<<"for foreman: ";
		foreman[i].getdata();
	}
	cout<<endl;
	for (int i = 0; i < 5; ++i)
	{
		foreman[i].putdata();
	}
	for (int i = 0; i < 5; ++i)
	{
		cout<<"for engineer: ";
		engineer[i].getdata();
	}
	for (int i = 0; i < 5; ++i)
	{
		engineer[i].putdata();
	}
	getch();
	return 0;
}
