#include <iostream>
#include <cmath>
using namespace std;

//class
class roots {
	int a, b, c;
	float r1, r2;
	public:
		void getdata();
		int determinant();
		void checkdeterminant(int);
};

void roots::getdata() {
	cout << "Enter value of coefficient of x^2: ";
	cin >> a;
	cout << "Enter value of coefficient of x: ";
	cin >> b;
	cout << "Enter value of coefficient of 1: ";
	cin >> c;
}

int roots::determinant() {
	int d = b * b;
	d -= (4 * a * c);
	return d;
}

void roots::checkdeterminant(int d) {
	if (d == 0) {
		cout << "Real and equal roots\n";
		r1 = (-1 * b);
		r1 /= (2 * a);
		r2 = r1;
		cout << "Roots : " << r1 << " and " << r2 << endl;
	}
	else if (d > 0) {
		cout << "Real and distinct roots\n";
		r1 = (-1 * b) + sqrt(d);
		r1 /= (2 * a);
		r2 = (-1 * b) - sqrt(d);
		r2 /= (2 * a);
		cout << "Roots : " << r1 << " and " << r2 << endl;
	}
	else {
		cout << "Imaginary roots" << endl << endl;
		r1 = (-b)/(2*a);
		r2 = (sqrt(-d))/(2*a);
		cout << "Roots : " << r1 << " + i" << r2 ;
		cout << " and " << r1 << " - i" << r2 << endl<<endl;
	}
}

int main() {
	roots r;
	
	r.getdata();
	
	cout << endl;
	int d = r.determinant();
	r.checkdeterminant(d);
	cout << endl;
	
	return 0;
}
