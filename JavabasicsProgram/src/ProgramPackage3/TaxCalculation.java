package ProgramPackage3;

public class TaxCalculation {

	public void  CalculateTax(Person person)
	{
		if(person.getAge()>65||person.getgender().equalsIgnoreCase("femal"))
		{	
			person.setTax(0);
			System.out.println("Tax is not applicationable");
	}
		else
		{
			if(person.getincome()<=160000)
			{
				person.setTax(0);
			}
			else if(person.getincome()>160000 && person.getincome()<=5000000)
			{
				person.setTax((person.getincome()-160000)*10/100);
			}
			else if(person.getincome()>5000000 && person.getincome()<=8000000)
			{
				person.setTax((person.getincome()-5000000)*20/100+34000);
			}
			else
			{
				person.setTax((person.getincome()-8000000)*30/100+94000);
			}
		}
		
	}

	}


