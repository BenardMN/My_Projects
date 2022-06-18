#include <iostream>
using namespace std;
class Line
{
private:
	double length;
public:
	void setLength(double len);
	double getLength(void);
	Line(); //constructor
	~Line(); //destructor
};
//member function definition including constructor
Line::Line(void){
	cout<<"Object is being created"<<endl;
}
Line::~Line(void){
	cout<<"Object is being deleted"<<endl;
}
void Line::setLength(double len){
	length = len;
}
double Line::getLength(void){
	return length;
}
int main() //main function of program
{
	Line line;
	line.setLength(6.0);
	cout<<"Length of line : "<<  line.getLength()<<endl;
	return 0;
}
