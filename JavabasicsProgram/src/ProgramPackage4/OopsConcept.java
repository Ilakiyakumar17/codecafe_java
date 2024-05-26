package ProgramPackage4;

public class OopsConcept {

		private int SerialNum;
		private String Name;
		private int age;
		
		public int getSerialNum()
		{
			return SerialNum;
		}
		public void setSerialNum(int SerialNum)
		{
			this.SerialNum = SerialNum;
		}
		public String getName()
		{
			return Name;
		}
		public void setName(String Name)
		{
			this.Name = Name;
		}
		public int getAge()
		{
			return age;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		public String toString()
		{
			return "oopsconcepts SerialNum=" +   SerialNum +    "Name=" + Name +    "age=" +age;
		}
}