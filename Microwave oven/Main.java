#include<iostream>
using namespace std;
int main()
{
  int items;
  double time;
  std::cin>>items>>time;
  if(items==2){
    std::cout<<(double)time*1.5;
  }
  else if(items==3){
    std::cout<<(double)time*2;
  }
  else{
    std::cout<<"Number of items is more";
  }
  //Type your code here.
}