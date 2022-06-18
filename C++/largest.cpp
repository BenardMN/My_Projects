#include<iostream>
using namespace std;
class numbers
{
	int i,n;
	public:
numbers(int a ,int b)
{
	i=a;
	n=b;
}
void getNum();
void displayNum();
};
void numbers::getNum()
{
    cout<<"Enter two numbers"<<i<<n<<endl;
	cin>>i;
    cin>>n;
}
void numbers::displayNum()
{
	if(i<n)
		cout<<"largest number is"<<n<<endl;
	else if(n<i)
		cout<<"largest number is"<<i<<endl;

}
int main()
{
	numbers num(6,1);
	num.getNum();
	num.displayNum();
	return 0;
}

