 #include<iostream>
using namespace std;
class Shape{
public:
    int length,width;
    };
class Rectangle:public Shape{
public:
    void areaRec(int length,int width)
    {
    int area;
    area=length*width;
    cout<<"area of rectangle "<<area<<endl;
    }};
    int main(){
    Rectangle k;
    k.areaRec(10,20);
    return 0;
    }
