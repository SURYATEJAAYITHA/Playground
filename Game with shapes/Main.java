#include<iostream>
using namespace std;
int main()
{
 int rad,len;
  std::cin>>rad>>len;
  if(2*rad<=len){
    std::cout<<"circle can be inside a square";
  }
  else{
    std::cout<<"circle cannot be inside a square";
  }//Type your code here.
}