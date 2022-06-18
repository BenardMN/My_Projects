#include<iostream>
#include<string>
using namespace std;
class Student
{
private:
	string name, program;
	int year, regNo;
public:
	void setName(string mary) {
		name = mary;
	}
	string getName(){
		return name;
	}
	void setProgram(string bme){
		program = bme;
	}
	string getProgram() {
	   return program;
    }
    int setYear(int){
    	year=2;
    }int getYear(){
    	return year; }
    int setregNo(int){
        regNo=2345;}
    int getRegNo(){
        return regNo;
    }
};
int main(){
  Student objname;
  objname.setName("mary");
  objname.getName();
  objname.setProgram("bme");
  objname.getProgram();
  objname.setYear(2);
  objname.getYear();
  objname.setregNo(2345);
  objname.getRegNo();
  return 0;
 }
