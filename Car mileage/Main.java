#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int petrol,distance;
  std::cin>>mileage>>petrol>>distance;
  if(distance/petrol<mileage){
    std::cout<<"Can reach";
  }
  else{
    std::cout<<"Cannot reach";
  }//Type your code here.
}