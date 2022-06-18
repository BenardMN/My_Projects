#include <iostream>
#include <string>
using namespace std;
class Animal
{
   string name="";
   public:
   int tail=1;
   int legs=4;

};
class Dog : public Animal
{
   public:
   void voiceAction()
   {
      cout<<"Barks!!!";
   }
};
class Puppy:public Dog{
   public:
   void weeping()
   {
      cout<<"Weeps!!";
   }
};
int main()
{
   Puppy puppy;
cout<<"Puppy has "<<puppy.legs<<" legs"<<endl;
cout<<"Puppy has "<<puppy.tail<<" tail"<<endl;
cout<<"Puppy ";
puppy.voiceAction();
cout<<" Puppy ";
puppy.weeping();
return 0;
}
