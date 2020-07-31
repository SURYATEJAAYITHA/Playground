#include<iostream>
int main(){
  int a;
  int n=11;
  int i=1;
  std::cin>>a;
  do{
    std::cout<<n*n<<" ";
    n+=4;
    i++;
  }while(i<=a);
}
    
    