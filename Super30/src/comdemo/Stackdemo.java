package comdemo;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stack s1=new Stack<>();
	s1.push(10);
	s1.push(20);
	s1.push(30);
	s1.push(40);
	s1.push(50);
	
	System.out.println(s1);
	System.out.println(s1.isEmpty());
	s1.pop();
	System.out.println(s1);
	System.out.println(s1.isEmpty());
		
	
	Stack<String> s2=new Stack<>();
	s2.push("aaa");
	s2.push("bbb");
	s2.push("aaaaa");
	s2.push("ccc");
	s2.push("ddd");
	System.out.println(s2.isEmpty());
	System.out.println(s2);
	s2.pop();
	System.out.println(s2);
	System.out.println(s1.isEmpty());
		
	}

}
