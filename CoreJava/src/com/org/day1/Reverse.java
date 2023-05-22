package com.org.day1;

public class Reverse {
public int solve(int x) {
	int res=0;
	while(x!=0) {
		res=res*10+x%10;
		x/=10;
	}
	return res;
}
}
