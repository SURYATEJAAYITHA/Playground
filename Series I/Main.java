#include<iostream>
int main(){
  int n;
   float a;
  int i=1;
  a=0.5;
  std::cin>>n;
  do{
    std::cout<<a<<" ";
    a*=3;
    i++;
  }while(i<=n);
}