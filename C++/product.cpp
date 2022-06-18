#include <iostream>
//#include <cmath>
using namespace std;
class product
{
private:
	int x,y;
public:
	product(int x,int y);
	void setdata(int m,int n){
	m=x;
	n=y;}
	int multiply(){
		return x*y;
	}
};
int main()
{
	product p,p2(6,4);
    p.setdata(4,5);
	p.multiply();
	return 0;
}
