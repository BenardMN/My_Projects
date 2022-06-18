#include <iostream>
#include <cmath>
using namespace std;
class Quadratic
{
private:
	float a, b, c, d,imaginaryPart,realPart,root1,root2;
public:
	Quadratic(float x,float y,float z){
		a = x;
		b = y;
		c = z;
	}
	~Quadratic();
	void capture_inputs(){
		cout<<"Enter coefficients a, b, c: ";
		cin >> a >> b >> c;
	}
	void display(){
		cout<<"\n coefficient of x^2: "<<a;
		cout<<"\n coefficient of x: "<<b;
		cout<<"\n constant term is: "<<c;
	}
	void process(float a,float b,float c){
		if (a == 0){
			cout<<"Invalid";
			return;
		}
		d=(b*b)-(4*a*c);

	if(d>0)
	{
		cout<<"\nTwo real and distinct roots";
		root1=(-b+sqrt(d))/(2*a);
		root2=(-b-sqrt(d))/(2*a);
		cout<<"\nRoots are "<<root1<<" and "<<root2;
	}
	else if(d==0)
		{
			cout<<"\nTwo real and equal roots";
			root1=root2=-b/(2*a);
			cout<<"\nRoots are "<<root1<<" and "<<root2;
		}
		else{
			cout<<"\nRoots are complex and imaginary";
			realPart = -b/(2*a);
            imaginaryPart = sqrt(-d)/(2*a);
        	cout<<"\nRoots are "<<realPart<<"+"<<imaginaryPart<<"i and "<<realPart<<"-"<<imaginaryPart<<"i";
		}
	}
};
int main()
{
	/* code */
	Quadratic obj1(1,2,1);
	obj1.capture_inputs();
	obj1.process();
	obj1.display();
	return 0;
}
