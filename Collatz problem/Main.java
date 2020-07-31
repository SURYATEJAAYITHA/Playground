#include<iostream>
using namespace std;
int main()
{
  int n,count1=0,count2=0;
  std::cin>>n;
  std::cout<<n<<"\n";
  while(n>1){
    if(n%2==1)
    {
     n=(3*n)+1;
      count1++;
    }
    else
    {
     n/=2;
      count2++;
    }
    std::cout<<n<<"\n";
    
  }
  std::cout<<count1+count2;//Type your code here.
}