#include <iostream>
#include <cmath>
#include <conio.h>
using namespace std;
class Roots {
private:
    int a, b, c;
public:
    Roots(int,int,int);
    void findRoots(int a, int b, int c){
    if (a == 0) {
        cout << "Invalid";
        return;
    }
    int d = b * b - 4 * a * c;
    double sqrt_val = sqrt(abs(d));
    if (d > 0) {
        cout << "Roots are real and different \n";
        cout << (double)(-b + sqrt_val) / (2 * a) << "\n";
        cout  << (double)(-b - sqrt_val) / (2 * a)<<endl;
    }
    else if (d == 0) {
        cout << "Roots are real and same \n";
        cout << -(double)b / (2 * a)<<endl;
    }
    else
    {
        cout << "Roots are complex \n";
        cout << -(double)b / (2 * a) << " + i" << sqrt_val<< "\n";
        cout << -(double)b / (2 * a) << " - i" << sqrt_val;
    }
}
};
Roots::Roots(int x,int y,int z){
a=x;
b=y;
c=z;
}
int main()
{
    int a = 1, b = -7, c = 12;
    Roots ap(1,-7,12);
    ap.findRoots(a,b,c);
    return 0;
}
