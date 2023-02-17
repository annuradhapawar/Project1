package com.demo.operaters;

public class Ecomm {
	   int productId;
	   String productName;
	   float productPrice;
	   String productDesc;
	   String manufact;
	   public Ecomm() {
	   }
	   
	   static {
		   System.out.println("hi static block");
	   }
	   {
		   System.out.println("Nonsatic block");
	   }
}
