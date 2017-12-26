#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;
long sumin(long sum)
{
	long temp=0;
	while(sum!=0)
	{
		temp+=(sum%10);
		sum/=10;
	}
	return temp;
}
long check(long sum)
{
	if(sum<10)
		return sum;
	return check(sumin(sum));
}
int main()
{
	long sum=0,i,mul = 0;
	char n[100020];
	cin>>n>>mul;
	for(i=0;n[i]!='\0';i++)
		sum+=(((int)n[i])-48);
	cout<<check(sum*mul);
}