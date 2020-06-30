#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,p;
  std::cin>>n;
  if(n<=200)
    p=n*0.5;
  else if(n<=400)
    p=100+n*0.65;
  else if(n<=600)
    p=200+n*0.8;
  else
    p=425+n*1.25;
  std::cout<<"Rs."<<p;
}