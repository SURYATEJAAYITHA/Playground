#include <iostream>
using namespace std;

int power_of_a_number(int base, int exponent)
{
    if (exponent != 0)
        return (base * power_of_a_number(base, exponent-1));
    else
        return 1;
}

int main()
{
    int base, exponent;
 std::cout<<"Enter the value of a";
    std::cin>> base;
    std::cout<<"\nEnter the value of n";
    std::cin>> exponent;
    std::cout <<"\nThe value of " <<base<<" power "<<exponent<<" is "<<power_of_a_number(base, exponent) << endl;
   
}


