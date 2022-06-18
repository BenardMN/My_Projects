#include <iostream>
using namespace std;

int main()
{
	int ftemp;	//temp in farenheit
	cout << "Enter temperature in farenheit: ";
	cin >> ftemp;
	int ctemp = (ftemp - 32) * 5 / 9;
	cout<< "Equivalent temperature in Celcius is: " << ctemp << '/n';
	return 0;
}