#include <iostream>
#include <string>
using namespace std;

string header = "	--- Demonstrates Unformatted Input ---";

int main(int argc, char** argv)
{
	string word, rest;
	
	cout << header
	     << "\n\nPress <enter> to go on" <<endl;
	     cin.get();		//read the new line without saving
	     
	     cout << "\nPlease enter a sentence with several words!" 
              << "\nEnd with <!> and press <enter>." <<endl;
	     cin >> word;	//reads first word and remaining text upto the character !
	     getline(cin, rest, '!');
	     
	     cout << "\nThe first word:  " << word
	          <<"\nRemaining text:  " << rest <<endl;
	return 0;
}