package ProgramPackage34;

public class Student {
	int id;
	String name;
	String branch;

	public Student(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

//	@Override
	public String toString() {
		return "Student information [id=" + id + ", name=" + name + ", branch=" + branch + "]";
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}
