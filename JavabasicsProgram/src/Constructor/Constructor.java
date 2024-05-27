//this is entity class for class Constructor
package Constructor;

public class Constructor {

	private String name;
	private int id;
	private int roll;
	//Default Constructor
	public Constructor() {
		super();
		//System.out.println("Default Constructor..");
		//name="Dhoni";
		   //id=7;
		// roll=12;
	}
	//Parameterized
	public Constructor(String name,int id) {
		super();
		System.out.println("Parameterized Constructor with 2 argument");
		this.name=name;
		this.id=id;
	}
    public Constructor (String name,int id, int roll)
    {
    	System.out.println("Parameterized Construct with 3 arguments!");
    	this.name=name;
    	this.id=id;
    	this.roll=roll;
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id=id;
    }
    public int getroll() {
    	return roll;
    }
    public void setroll(int roll) {
    	this.roll=roll;
    }
    @Override
    public String toString() {
    	return "construct [name="+name+",id="+id+",roll="+roll+"]";
    	
}
}