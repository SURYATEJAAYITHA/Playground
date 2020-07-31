#include <iostream>
int main() 
{
  int a,reverse=0,rem;
  std::cin>>a;
	while(a!=0)
    {
      rem=a%10;
      reverse=reverse*10+rem;
      a/=10;
    }
  std::cout<<reverse;// Type your code here
	return 0;
}