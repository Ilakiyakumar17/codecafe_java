package Constructor;

public class Employee {

	private int eid;
	private String ename;
	
	public Employee()
	{
		this(100,"ilakiya");
		System.out.println("Default constructor has been called");
	}
	public Employee(int eid,String ename)
	{
		//this();//calling default constructor
		this.eid=eid;
		this.ename=ename;
	}
	public String getEname() {
    	return ename;
    }
    public void setEname(String ename) {
    	this.ename=ename;
    }
    public int getEid() {
    	return eid;
    }
    public void setEid(int eid) {
    	this.eid=eid;
    
    }
    @Override
    public String toString() {
    	return "Employee [ename="+ename+",eid="+eid+"]";
    	}

}
