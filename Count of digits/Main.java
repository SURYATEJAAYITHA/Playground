#include<iostream>
int main()
{
  int a,count=0,rem;
  std::cin>>a;
  do{
    rem=a%10;
    a/=10;
    count++;
  }while(a>0);
    std::cout<<count;
  // Type your code here
}