#include <iostream>
using namespace std;

int main(int argc, char** argv)
{
	float limit, speed, toofast;
	cout << "\nSpeed limit: ";
	cin >> limit;
	cout << "\nSpeed: ";
	cin >> speed;
	
	if((toofast = speed - limit) < 10){
		cout << "You are lucky!" << endl;
	} else if(toofast < 100){
		cout << "Fine payable: 4000,-. Shillings" << endl;
	} else if(toofast < 180){
		cout << "Fine payable: 8000,-. Shillings" << endl;
	} else{
		cout << "Handover your driver's licence!" << endl;
	}
	return 0;
}