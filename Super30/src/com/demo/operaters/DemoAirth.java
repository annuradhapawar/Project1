package com.demo.operaters;

public class DemoAirth {

	// TODO Auto-generated method stub
	int a,b,Result;
	void getData(int a, int b)
	{
		this.a=a;
		this.b=b;

	}
	void add() {
		Result=a+b;
		System.out.println("addition is "+Result);
	}
	void sub() {
		Result=a-b;
		System.out.println("substraction is "+Result);
	}
	void mul() {
		Result=a*b;
		System.out.println("multiplication is "+Result);
}
	void div() {
		Result=a/b;
		System.out.println("div is "+Result);
	}
}
