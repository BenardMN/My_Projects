#include <iostream>
using namespace std;

const long delay = 10000000L;

int main(int argc, char** argv)
{
	int tic;
	cout << "\nHow often do you want the tone to be output? ";;
	cin >> tic;
	
	do{
		for(long i = 0; i < delay; ++i);
		cout << "Now the tone!\a" << endl;
	}
	while( --tic > 0);
	
	cout << "End of acoustic interlude!\n";
	return 0;
}