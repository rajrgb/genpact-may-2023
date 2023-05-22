package com.org.day1;

import java.util.*;

public class PairSum {
private List<Integer> arr;
int sum;

public List<Integer> getArr() {
	return arr;
}

public void setArr(List<Integer> arr) {
	this.arr = arr;
}

public int getSum() {
	return sum;
}

public void setSum(int sum) {
	this.sum = sum;
}

public PairSum() {
	super();
	// TODO Auto-generated constructor stub
}

public PairSum(List<Integer> arr, int sum) {
	super();
	this.arr = arr;
	this.sum = sum;
}

public void solve() {
	int i=0;
	Collections.sort(arr);
	for(int a:arr) {
		int b=sum-a;
		int index=Collections.binarySearch(arr, b);
		if(index!=i&&index>=0) {
			System.out.println("Two elements whose sum= "+sum+" are "+a+" and "+b);
			return;
	}
		i++;
	}
	System.out.println("Given sum is not possible with any elements addition.");
}
}
