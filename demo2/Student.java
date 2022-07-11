package collectionDemo;

 public class Student {

	private int id;
	private String name;
	private int age;
	private String section;
	private int examMarks;
	private static String clgName = "jntu";
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		//validation   nikhil123 // Nikhil123
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		//validation
		this.age = age;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public int getExamMarks() {
		return examMarks;
	}


	public void setExamMarks(int examMarks) {
		if(examMarks>100) {
			System.out.println("marks should not be grater then 100, please set valid marks");
		}else {
		//if 1st internal marks exist check , then avg/best 2  
		//	getInternalmarks1 >2
		this.examMarks = 79;
		
		System.out.println("marks validated and inserted");
		}
	}


	public static String getClgName() {
		return clgName;
	}


	public static void setClgName(String clgName) {
		Student.clgName = clgName;
	}


	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", section=" + section + ", examMarks="
				+ examMarks + "]";
	} 
	
	
	public  boolean equals(Object obj2) {
		
		String s1Name = this.getName();
		Student s2 = (Student)obj2;
		String s2Name = s2.getName();

		return s1Name.equals(s2Name);
		   
		   
		
	
	}
	
	
/*public int hashcode() {
	
	return 0;
} */
	Student(){}

/*	public Student(int id1, String name1) {
		//System.out.println("hash of current object in studen class : " +this.hashCode());
		this.id = id1;
		this.name = name1;
		
	}

	public Student(int id1, String name1, int age1, String section1) {
		//System.out.println("hash of current object in studen class : " +this.hashCode());
		this.id = id1;
		this.name = name1;
		this.age = age1;
		this.section = section1;
	}
	
*/
	public void reading() {
		System.out.println("i can read");
	}
	
	public void play() {
		System.out.println("i can play");
	}
	
	public void write() {
		System.out.println("i can write in parent");
	}
	
	public void write(String s) {
		System.out.println("i can write in parent with arg");
	}
	
	public int marks(String name,int marks) {
		System.out.println("marks of student :"+name + " is " +marks);
		return marks;
	}

}
