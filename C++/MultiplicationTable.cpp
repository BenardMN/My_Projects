#include <iostream>
#include <iomanip>
using namespace std;

int main(int argc, char** argv)
{
	int factor1, factor2;
	cout << "\n\n		"
	     << " ***	MULTIPLICATION TABLE	***"
	     << endl;
	     
	     //outputs first and second line
	     cout << "\n\n\n	";	//line 1
	     for( factor2 = 1; factor2 <= 10; ++factor2)
	     	cout << setw(5) << factor2;
	     
	     cout<< "\n	"		//line 2
	         << "---------------------------------------------------"
	         <<endl;
          for (factor1 = 1; factor1 <=10; ++factor1){
			  cout << setw(6) << factor1 << " |";
			  for( factor2 = 1; factor2 <= 10; ++factor2)
			  	cout << setw(5) << factor1 * factor2;
			  cout << endl;
		  }
		  cout << "\n\n\n";		//to shift the table
	return 0;
}