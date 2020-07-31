//C++ Program
//Harshad number or not
#include <iostream>
using namespace std;
//main program
int main()  
{  
    int num,sum = 0;  
    //user input
    cin>>num;
    int n = num;   
    //loop to calculate the sum of digits
    while(num > 0)
    {  
        int rem = num%10;  
        sum = sum + rem;  
        num = num/10;  
    }      
    //checking for harshad number
    if(n % sum == 0)  
        cout<<"Harshad Number";  
    else  
        cout<<"Not Harshad Number";
    }