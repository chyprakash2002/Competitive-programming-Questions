#include<bits/stdc++.h> 
using namespace std; 
 
int main() 
{ 
long long int cnt; 
cin>>cnt; 
while(cnt--) 
{ 
long long int n; 
cin>>n; 
vector<long long int> v(n); 
long long int c=0; 
for(long long int i=0;i<n;i++) 
{ 
cin>>v[i]; 
if(v[i]==1) 
{ 
c++; 
} 
} 
sort(v.begin(),v.end()); 
for(long long int i=0;i<n;i++) 
{ 
if(v[i]!=1 && v[i]%2==0 && c>0) 
{ 
v[i]++; 
c--; 
} 
} 
long long int value=1; 
for(long long int i=0;i<n;i++) 
{ 
value =(value*v[i])%998244353; 
} 
cout<<value<<endl; 
}
return 0;
}