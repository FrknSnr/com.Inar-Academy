package chapters.chapter10.Exercise24;

public class MyCharacter {

    private char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public char charValue() {
        return ch;
    }

    public static MyCharacter valueOf(char ch) {
        return new MyCharacter(ch);
    }

    public static int compare(char x, char y) {
        if (x > y)
            return 1;
        else if (x < y)
            return -1;
        else
            return 0;
    }

    public int compareTo(MyCharacter c) {
        if (charValue() > c.charValue())
            return 1;
        else if (charValue() < c.charValue())
            return -1;
        else
            return 0;
    }

    public static boolean isLetterOrDigit(char ch) {
        return ch <= 'Z' && ch >= 'A' || ch <= 'z' && ch >= 'a' || ch <= 57 && ch >= 48;
    }

    public static char toUpperCase(char ch) {
        if (ch <= 'z' && ch >= 'a') {
            return (char) (ch - ('a' - 'A'));
        }
        return ch;
    }
    public static MyCharacter toLowerCase(MyCharacter ch){
        if (ch.charValue() <= 'Z' && ch.charValue() >= 'A') {
            return new MyCharacter((char)((ch.charValue() + ('a' - 'A'))));
        }
        return ch;
    }

    public static char toLowerCase(char ch) {
        if (ch <= 'Z' && ch >= 'A') {
            return (char) (ch + ('a' - 'A'));
        }
        return ch;
    }

    public String toString(){
        return ch + "" ;
    }
}
