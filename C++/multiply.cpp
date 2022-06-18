#include<iostream>;
using namespace std;
class multiply
{
public:
	int x, i, result;
	int product(){
	for (int i=1; i<=15; i++)

            cout<<"10 * "<<i<<" = "<<10*i<<endl;
        }
};
int main()
{
     multiply obj;
     obj.product();
	return 0;
}
