#include <iostream>
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
};
int main()
{
    Calculation obj2;
	obj2.print(10);
	obj2.print(10.10);
	obj2.print("ten");
	return 0;
}
