/* program to print smiling face on screen */
#include <iostream>
#include <conio.h>
using namespace std;
int main()
{
	/* code */
	int sml=1, i, limit;
	char ch = sml;
	cout<<"How many smiley faces do you want to print?";
	cin>>limit;
	for (int i = 0; i<limit; ++i)
	{
		/* code */
		cout<<ch<<" ";
	}
	getch();
}
