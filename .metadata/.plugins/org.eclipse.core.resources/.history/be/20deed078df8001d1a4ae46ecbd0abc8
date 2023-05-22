package com.org.day1;

public class SecondLargest {
public int solve(float[] arr, int n) {
	int i;
	int pos=-1;
	int p=0;
	float max=arr[pos];
	for(i=0;i<n;i++) {
		if(arr[i]>max) {

			max=arr[i];
			pos=i;
		}
	}
	p=pos+1;
	float secMax=arr[(pos+1)%n];
	for(i=0;i<n;i++) {
		if(arr[i]>secMax&&i!=pos) {
			p=i;
			secMax=arr[i];
		}
	}
	return p;
}
}
