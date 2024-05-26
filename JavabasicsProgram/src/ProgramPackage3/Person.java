package ProgramPackage3;

public class Person {
	private String name;
	private int age;
	private  int income;
    private String gender;
    private int tax;
    public String getName()
    {
    	return name;
    }
    public  void setName(String name)
    {
    	this.name = name;
    }
    public int getAge()
    {
    	return age;
    }
    public void setAge(int age)
    {
    	this.age = age;
    }
    public int getincome()
    {
    	return income;
    }
    public void setincome(int income)
    {
    	this.income = income;
    }
    public String getgender()
    {
    	return gender;
    }
    public void setgender(String gender)
    {
    	this.gender =gender;
    }
    public int getTax()
    {
    	return tax;
    }
    public void setTax(int Tax)
    {
    	this.tax = Tax;
    }
    public String toString()
    {
    	return "person name="+ name +", age="+ age +", income=" + income +", gender=" + gender;
    }
}