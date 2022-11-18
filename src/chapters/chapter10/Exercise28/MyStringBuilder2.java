package chapters.chapter10.Exercise28;

import chapters.chapter10.Exercise22.MyString1;
import chapters.chapter10.Exercise23.MyString2;

public class MyStringBuilder2 {

    private String s;

    public MyStringBuilder2() {
        this("");
    }

    public MyStringBuilder2(char[] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        this.s = s;
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String a = "";
        for (int i = 0; i < offset; i++) {
            a += this.s.charAt(i);
        }
        a += s;
        for (int i = offset; i < this.s.length(); i++) {
            a += this.s.charAt(i);
        }
        this.s = a;
        return this;
    }

    public MyStringBuilder2 reverse() {
        String s = "";
        for (int i = this.s.length() - 1; i <= 0; i++) {
            s += this.s.charAt(i);
        }
        this.s = s;
        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        String s = "";
        for (int i = begin; i < this.s.length(); i++) {
            s += this.s.charAt(i);
        }
        this.s = s;
        return this;
    }

    public MyStringBuilder2 toUpperCase() {
        String s = "";
        for (int i = 0; i < this.s.length(); i++) {
            if (this.s.charAt(i) >= 'a' && this.s.charAt(i) <= 'z') {
                s +=(char) (this.s.charAt(i) - ('a' - 'A'));
            } else
                s += this.s.charAt(i);
        }
        this.s = s;
        return this;
    }

    public String toString() {
        return s;
    }

}
