#include <iostream>
#include <iomanip>
using namespace std;

int main(int argc, char** argv)
{
	double rate = 1.15;
	
	cout << fixed << setprecision(2);
	cout << "\tEuro \tDollar\n";
	
	for(int euro = 1; euro <= 5; ++euro){
		cout << "\t" << euro
		     << "\t" << euro * rate << endl;
	}
	return 0;
}