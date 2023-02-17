package comdemo;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;
import javax.swing.border.EmptyBorder;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList aList = new ArrayList();
    aList.add(10);
    aList.add("Pune");
    aList.add(true);
    aList.add("MIT");
    aList.add(54.4f);
    aList.add(10);
    System.out.println(aList.size());
    System.out.println(aList);
    aList.remove("Pune");
    System.out.println(aList);
    System.out.println(aList.contains("MIT"));
    System.out.println(aList.isEmpty());
    System.out.println(aList.get(2));
    
    ArrayList<String> a1=new ArrayList<>();
    a1.add("Pune");
    a1.add("delhi");
    a1.add("mumbai");
    a1.add("Pune");
    System.out.println(a1);
    
    
    ArrayList<Integer> i1=new ArrayList<>();
    i1.add(44);
    i1.add(33);
    i1.add(33);
    i1.add(84);
    System.out.println(i1);
    
    ArrayList L1 = new ArrayList();
    L1.add(10);
    L1.add("Pune");
    L1.add(true);
    L1.add("MIT");
    L1.add(54.4f);
    L1.add(10);
    //for(Object obj:L1)
    {
    	//System.out.println(obj);
    }
    
    System.out.println("abstract lis example");
    i1.add(55);
    i1.add(65);
    i1.add(75);
    i1.add(85);
    i1.add(95);
    for (Object obj: i1)
    {
    	System.out.println(obj);
    }
	}

}
