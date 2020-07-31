#include<iostream>
using namespace std;
int main()
{
  int fam,fc,sam,sc,aam,ac;
  float fd,sd,ad;
  int f,s,a;
  std::cin>>fam>>fd>>fc>>sam>>sd>>sc>>aam>>ad>>ac;
  f=fam-(fam*(fd/100))+fc;
  s=sam-(sam*(sd/100))+sc;
  a=aam-(aam*(ad/100))+ac;
  std::cout<<"In Flipkart"<<" Rs."<<f<<"\n";
  std::cout<<"In Snapdeal"<<" Rs."<<s<<"\n";
  std::cout<<"In Amazon"<<" Rs."<<a<<"\n";
  if(f<=a&&f<=s){
    std::cout<<"He will prefer Flipkart";
  }
  else if(s<=a){
    std::cout<<"He will prefer Snapdeal";
  }
  else{
    std::cout<<"He will prefer Amazon";
  }//Type your code here.
}