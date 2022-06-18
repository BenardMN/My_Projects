//parameterised constructor
#include <iostream>
#include<conio.h>
using namespace std;
class volume
{
	int length,bredth,height;
public:
	volume(int l,int b,int h){
		length=l;
		bredth=b;
		height=h;
		cout<<"Length of Cuboid is: "<<length<<endl;
		cout<<"Bredth of Cuboid is: "<<bredth<<endl;
		cout<<"Height of Cuboid is: "<<height<<endl;
	}
	void display(){
	     cout<<"Volume of Cuboid is: "<<length*bredth*height;
	}
	
};
int main(int argc, char const *argv[])
{
    volume a(5,10,10);
    a.display();
	return 0;
}