package com.org.day1;

public class Swap {
private int a;
private int b;
private float x;
private float y;

public float getX() {
	return x;
}

public void setX(float x) {
	this.x = x;
}

public float getY() {
	return y;
}

public void setY(float y) {
	this.y = y;
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public Swap() {
	super();
	// TODO Auto-generated constructor stub
}

public Swap(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
public Swap(float x, float y) {
	this.x=x;
	this.y=y;
}
public void solve() {
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("A= "+a+" B= "+b);
}
public void solveFloat() {
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("X= "+x+" Y= "+y);
}
}
