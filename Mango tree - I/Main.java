#include<iostream>
using namespace std;
int main()
{
  int rows,columns,treenum;
  std::cin>>rows>>columns>>treenum;
  if(treenum<=columns||treenum%columns==0||(--treenum)%columns==0){
  std::cout<<"Yes";
  }
  else{
  std::cout<<"No";
  }//Type your code here.
}