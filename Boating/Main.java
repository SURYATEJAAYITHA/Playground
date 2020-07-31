#include<iostream>
using namespace std;
int main()
{
  int a,b,c,x;
  std::cin>>a>>b>>c;
  x=a-75*b-30*c;
  if(x>0){
    std::cout<<"Boat is stable";
  }
  else{
    std::cout<<"Boat will drow";
  }
  //Type your code here.
}