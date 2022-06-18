#include <iostream>
using namespace std;
class Swapping {
    private:
	int num1, num2;
	public:
	    void capture(int x,int y){
             num1=x;
	         num2=y;
	    cout<<"The original value of number 1 is\t"<<num1<<endl;
	    cout<<"The original value of number 2 is\t"<<num2<<endl;
	    }
	    void Swap(){
	    int temp;
	    temp=num1;
	    num1=num2;
	    num2=temp;
	    }
	    void display(){
	    cout<<"Value of number 1 is\t"<<num1<<endl;
	    cout<<"Value of number 2 is\t"<<num2;
	    }
};
int main(){
    Swapping k;
    k.capture(30,80);
    k.Swap();
    k.display();
    return 0;
    }
