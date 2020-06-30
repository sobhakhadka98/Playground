#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float x1,x2,x3,y1,y2,y3;
  std::cin>>x1>>y1;
  std::cin>>x2>>y2;
  std::cin>>x3>>y3;
  x1=(x1+x2+x3)/3;
  y1=(y1+y2+y3)/3;
  std::cout<<x1<<"\n"<<y1;
  return 0;
}