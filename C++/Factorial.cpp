#include<iostream>
#include<conio.h>
using namespace std;
class Copy {
public:
    int var;
    int fact;
~Copy();
Copy(int temp) {
var = temp;
}
int factorial_calculate() {
int fact = 1;
int i;
for (i = 1; i <= var; i++) {
fact = fact * i;
}
return fact;
}
};
//Copy::~Copy(){
//    delete[] var;
//}
int main() {
int n;
//cout << "Simple Copy Constructor For Find Factorial Example Program In C++\n";
cout << "\nEnter the Number : ";
cin>>var;
Copy obj();
Copy obj2 = obj;
cout << "\n" << n << " Factorial is:" << obj.factorial_calculate();
//cout << "\n" << n << " Factorial is:" << obj2.factorial_calculate();
getch();
return 0;
}

