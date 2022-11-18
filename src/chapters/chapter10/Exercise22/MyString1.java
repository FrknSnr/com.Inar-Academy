package chapters.chapter10.Exercise22;

public class MyString1 {

    private char[] chars;


    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public static MyString1 valueOf(int i) {
        String s = "" + i;
        char[] ch = new char[s.length()];
        for (int j = 0; j < s.length(); j++) {
            ch[j] = s.charAt(j);
        }
        return new MyString1(ch);
    }

    public boolean equals(MyString1 s) {
        if (s.length() != chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public MyString1 substring(int begin, int end) {
        char[] ch = new char[end - begin];
        for (int i = begin, j = 0; i < end; i++, j++) {
            ch[j] = chars[i];
        }
        return new MyString1(ch);
    }

    public MyString1 toLowerCase() {
        char[] ch = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ch[i] += Character.toLowerCase(chars[i]);
        }
        return new MyString1(ch);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        return s;
    }
}
