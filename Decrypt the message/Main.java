#include <iostream> 
int main(){
    int a,b,n,i=1,sum=0;
    std::cin >> a>>b;
  n=a+b;
       while(i<n){
       if(n%i==0)
       sum=sum+i;
       i++; 
}
 
if(sum==n)
    std::cout << "They can read the message"; 
else
    std::cout << "They can't read the message";
return 0;
}