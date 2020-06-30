#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  float s=0;
  while(1){
    cin>>n;
    if(n<0){
      s--;
      break;
    }
    else if(n==0)
      continue;
    else if(n%2 == 0)
      s=s-0.5;
    else{
      s++;
      c++;
      if(c==3)
        break;
    }
  }
  cout<<s<<endl;
  return 0;
}