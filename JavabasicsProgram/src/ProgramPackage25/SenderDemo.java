//Driver Program for creating generic class - Sender
package ProgramPackage25;

public class SenderDemo {

	public static void main(String[] args) {
		Sender<String> stringSender =new Sender<String>("Hello! How are you?");//Message as String 
		
		Sender<Person> personSender =new Sender<Person>();
		personSender.setMessage(new Person("Amit","Pune")); //Message as Person Object

		stringSender.sendMessage();
		personSender.sendMessage();
	}

}