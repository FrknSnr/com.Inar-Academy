package chapters.chapter10.Exercise23;

public class MyString2 {

    private String s;

    public MyString2(String s) {
        this.s = s;
    }

    public MyString2 substring(int begin) {
        String s = "";
        for (int i = begin; i < s.length(); i++) {
            s += s.charAt(i);
        }
        return new MyString2(s);
    }

    public int compare(String s) {
        if (this.s.length() == s.length()) {
            return 0;
        } else if (this.s.length() < s.length()) {
            return -1 ;
        } else return 1;
    }

    public MyString2 toUpperCase() {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            newS += Character.toUpperCase(s.charAt(i));
        }
        return new MyString2(newS);
    }

    public char[] toChars() {
        return s.toCharArray();
    }

    public static MyString2 valueOf(boolean b){
        return new MyString2( b + "" ) ;
    }

    public String toString(){
        return s ;
    }
}
