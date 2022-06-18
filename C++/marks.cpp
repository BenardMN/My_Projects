#include <iostream>
#include <conio.h>
using namespace std;
class marks
{
private:
	int m1,m2;
public:
	void getdata(){
    cout<<"Enter marks for subject 1: ";
	cin>>m1;
	cout<<"Enter marks for subject 2: ";
	cin>>m2;
}
	void displaydata(){
	cout<<"Subject 1 mark= "<<m1;
	cout<<"Subject 2 mark= "<<m2;
}
};
int main()
{
	marks s;
	s.getdata();
	s.displaydata();
	return 0;
}
