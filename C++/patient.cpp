#include<iostream>
using namespace std;
class PatientDetails
{
private:
	string firstName, middleName, surname;
	int age;
public:
	void capture();
	void process();
	void display();
};
void PatientDetails:: capture(){
	cout<<"Enter firstName: ";
	cin>>firstName;
	cout<<"Enter middleName: ";
	cin>>middleName;
	cout<<"Enter surname: ";
	cin>>surname;
	cout<<"Enter age: ";
	cin>>age;
}
void PatientDetails :: process(){
	if(age>0){
		cout<<"\nProcessing patient details, Please wait...";}
	}
void PatientDetails :: display(){
	cout<<"\nDetails: "+firstName+" "+middleName+" "+surname<<endl;
	cout<<"Age: "<<age;
}
int main()
{
	PatientDetails patient;
	patient.capture();
	patient.process();
	patient.display();
	return 0;
}
