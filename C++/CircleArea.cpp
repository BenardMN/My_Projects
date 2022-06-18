#include<iostream>
using namespace std;
const double pi=3.142; //constant declaration
class Circle{ //class begins here
    private:
	    double radius;
	    double area;
	public:
	   Circle(){ //default constructor
	         radius=0;
		 }
		Circle (double r){ //parameterized constructor
		     radius=r;
		 }
		Circle(Circle&t) //copy constructor
		 {
		      radius = t.radius;
		 }
        void getData(){
		     cout<<"Enter the radius of a circle\n";
			 cin>>radius;
		 }
		double calculateArea (){
		    // double area;
			double area=pi*radius*radius;
			 cout<<"Area of a Circle is\t"<<area<<endl;
			 }
}; //end of class
int main(){ //Begin of main function
    Circle k; //object declaration
	k.getData();
	k.calculateArea();
	return 0;
}
