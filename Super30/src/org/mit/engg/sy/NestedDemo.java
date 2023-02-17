package org.mit.engg.sy;

public class NestedDemo {
public static void main(String[] args) {
	int a=10, b=20, c=30;
	if (a>b && a>c)
	{
		System.out.println("A is greter");
	}
	else if (b>a && b>c)
	{
		System.out.println("B is greter");
	}
	else if (c>a && c>b)
	{
		System.out.println("c is greter");	
	}
	else {
		System.out.println("all equal");
	}
}
}
