#include <iostream>
#include <string>
using namespace std;

string header = "  --Calculates Average of a Number of Integers--";

int main(int argc, char** argv)
{
	int x, count;
	float sum = 0.0;
	
	cout << header 
	     << "\n\nPlease enter some integers: "
	     << "\n(Break with any letter)" << endl;
	     
   while(cin >> x)
   {
	   sum += x;
	   ++count;
   }
   cout << "The avarage of the numbers: " << sum / count <<endl;
	return 0;
}