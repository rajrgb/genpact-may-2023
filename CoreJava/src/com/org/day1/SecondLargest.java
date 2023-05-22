package com.org.day1;

public class SecondLargest {
private float[] arr;
private int n;

public float[] getArr() {
	return arr;
}

public void setArr(float[] arr) {
	this.arr = arr;
}

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

public SecondLargest() {
	super();
	// TODO Auto-generated constructor stub
}

public SecondLargest(float[] arr, int n) {
	super();
	this.arr = arr;
	this.n = n;
}

public int solve() {
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
