#include<iostream>
using namespace std;
int main()
{
int n = 3,a;
cin >> a;
for(int i=1;i<=n+1;i++)
{
for(int j=1;j<=i;j++)
cout<<a;
a++;
cout<<endl;
}
a--;
for(int i=n+1;i>=1;i--)
{
for(int j=1;j<=i;j++)
cout<<a;
a--;
cout<<endl;
}
}