
//Program to define child class WordPad with formatting text feature
package ProgramPackage12;

public class WordPad extends NotePad {
    private boolean isBold;

    public WordPad() {
        super();
        this.isBold = false;
    }

    public void formatText(boolean bold) {
        if (bold) {
            content = "<b>" + content + "</b>";
        }
        isBold = bold;
    }

    public boolean isBold() {
        return isBold;
    }
}