package comdemo;

public class Student {
	
	private int id;
	private String name;
	private String mob;
	private String city;
	private String dept;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String mob, String city, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.city = city;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mob=" + mob + ", city=" + city + ", dept=" + dept + "]";
	}
	
}
	