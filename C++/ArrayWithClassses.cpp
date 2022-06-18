#include <iostream>
#include <conio.h>
using namespace std;
class employee
{
private:
	char name[20];
	int sal,age;
public:
	void getdata();
	void putdata();
};
void employee::getdata(){
	cout<<"Enter name: ";
	cin>>name;
	cout<<"Enter salary: ";
	cin>>sal;
	cout<<"Enter age: ";
	cin>>age;
}
void employee::putdata(){
	cout<<"name"<<name <<endl;
	cout<<"salary"<<sal <<endl;
	cout<<"age"<<age <<endl;
}
int main()
{
	/* code */
	employee emp[5];
	for (int i = 0; i < 5; ++i)
	{
		/* code */
		emp[i].getdata();
	}
	cout<<endl;
	for (int i = 0; i < 5; ++i)
	{
		/* code */
		emp[i].putdata();
	}
	getch();
	return 0;
}
