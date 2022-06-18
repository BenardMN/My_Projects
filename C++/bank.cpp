#include<iostream>;
using namespace std;
class Bank
{
private:
	char name[30], account_name[40];
	int age, id, account_number;
	float balance = 20300;
public:
	Bank(int a, int b, int c){
		age = a;
		id = b;
		account_number = c;
	}
	//Bank();
	~Bank(){
	balance = 0;
	cout<<"Destructor called to destroy object.";}
	void capture();
	void display();
};
void Bank::capture(){
		cout<<"Enter customer name and account name: "<<endl;
		cin>>name>>account_name;
	}
void Bank::display(){
		cout<<"Name: "<<name<<" Account name: "<<account_name<<endl;
		cout<<"Age: "<<age<<" Id: "<<id<<" Account number: "<<account_number<<endl;
		cout<<"Account balance: "<<balance<<endl;
	}
int main()
{
	Bank b(20, 3455657, 0112234222344);
	b.capture();
	b.display();
	return 0;
}
