#include <iostream>
using namespace std;
int fact(int n) { 
   if ((n==0)||(n==1))
      return 1; 
   else
      return n*fact(n-1);
}
int main() {
  int n;
  std::cin>>n;
  fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);
}