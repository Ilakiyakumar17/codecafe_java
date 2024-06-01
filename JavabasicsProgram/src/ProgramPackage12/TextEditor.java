//Program to demonstrate Multilevel Inheritance
package ProgramPackage12;

public class TextEditor {

	public static void main(String[] args) {
		Word word = new Word();

		word.write("Hello, ");
		word.formatText(true);
		word.write("World!");
		word.displayContent();

		word.spellCheck();

		System.out.println("Is text in Wordpad bold? " + word.isBold());
		System.out.println("Disabling spell check in Word.");
		word.enableSpellCheck(false);
		word.spellCheck();
	}
}
