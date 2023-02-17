package comdemo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> aList=new ArrayList<>();
		ArrayList<Student> a12=new ArrayList<>();
				System.out.println(a12);
				System.out.println(a12.size());
		Student s1=new Student();
		s1.setId(101);
		s1.setName("ram");
		s1.setCity("pune");
		s1.setDept("Hr");
		s1.setMob("12345");

		Student s2=new Student();
		s1.setId(102);
		s1.setName("sham");
		s1.setCity("dhule");
		s1.setDept("etx");
		s1.setMob("7890");
		aList.add(s1);
		aList.add(s2);

		for(Student student:aList)
		{
			System.out.println(student);
		}
	}
}

