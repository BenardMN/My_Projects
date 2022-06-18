#include<iostream>;
#include<string>;//program to demonstrate encapsulation
using namespace std;
class Student
{
private:
	char name[30], program[30];
	int regNo, year;
public:
	void setName(){
		cout<<"Enter students name: ";
		cin>>name;
	}
	void setProgram(){
		cout<<"Enter program: ";
		cin>>program;
	}
	int setregNo(int reg){
		regNo = reg;
	}
	int setYear(int tr){
	   year = tr;
	}
	void getName(){
		cout<<"Students name is: "<<name<<endl;
	}
	void getProgram(){
		cout<<"Program is: "<<program<<endl;
	}
	int getregNo(){
		return regNo;
	}
	int getYear(){
	    return year;}
};
int main()//int argc//, char const// *argv[]))
{
	Student s1;
	s1.setName();
	s1.setProgram();
	s1.setregNo(4509);
	s1.setYear(4);
	s1.getName();
	s1.getProgram();
	//cout<<"Registration number:
	 s1.getregNo();
	//cout<<"\nYear of study: "<<
	s1.getYear();
	return 0;
}
