package org.mit.engg.sy;

public class Product {
	int pId;
	String pname;
	float pPrice;
	void getDetails(int pId, String pname, float pPrice)
{
	this.pId=pId;
	this.pname=pname;
	this.pPrice=pPrice;
}
    void displayProductDetails()
    {
    	System.out.println("Product Id  is:  "+pId);
    	System.out.println("Product Name  is:  "+pname);
    	System.out.println("Product Price  is:  "+pPrice);
    }
}