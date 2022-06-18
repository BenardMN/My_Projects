#include<iostream>;
using namespace std;
class smallest
{
private:
	int x, y ,z;
public:
    smallest(int a, int b, int c){
    x = a;
    y = b;
    z = c;}
	~smallest(){
		x=0;
		y=0;
		z=0;
		cout<<"\nDestructor called to destroy object.";
	}
	void input(){
		cout<<"Enter three numbers: "<<endl;
		cin>>x>>y>>z;
	}
	void dispay(){
		cout<<"x = "<<x<<" y = "<<y<<" z = "<<z<<endl;
	}
    void process(){
    	if(x<y && x<z){
    		cout<<"smallest number is: "<<x;
    	}else if(y<x && y<z){
    		cout<<"smallest number is: "<<y;
    	}else{
    		cout<<"smallest number is: "<<z;
    	}
    }
};
int main(int argc, char const *argv[])
{
    smallest num(43, 54, 30);
    num.input();
    num.dispay();
    num.process();
	return 0;
}
