#include<iostream>
using namespace std;
int main()
{
  int rows,columns,tree;
  std::cin>>rows>>columns>>tree;
  if(tree>rows&&tree<=rows*2){
    std::cout<<"It is a mango tree";
  }
  else if(tree>columns*(rows-2)&&tree<=columns*(rows-1)){
    std::cout<<"It is a mango tree";
  }
  else{
    std::cout<<"It is not a mango tree";
  }//Type your code here.
}