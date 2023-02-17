package org.mit.engg.sy;

import java.util.Scanner;

public class Demoswitch {

public static void main(String[] args) {
	// TODO Auto-generated method stub
String a;
Scanner s1= new Scanner(System.in);
System.out.println("Enter Value");
a=s1.next();
switch(a)
{
case "Virat":
System.out.println("I am Virat");
break;
case "Surya":
System.out.println("I am Surya");
break;
case "Kohali":
System.out.println("Kohali");
break;
default:
	System.out.println("wrong data");
	
}
}

