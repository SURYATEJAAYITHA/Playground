#include<iostream>
int main(){
  int a;
  std::cin>>a;
  int n=6;
  int p=5;
  int i=1;
  do{
    std::cout<<n<<" ";
    n+=p;
    p+=5;
    i++;
  }while(i<=a);
}