package chapters.chapter10.Exercise24;

public class Test {
    public static void main(String[] args) {

        MyCharacter ch = new MyCharacter('F');
        ch = MyCharacter.toLowerCase(ch) ;
        System.out.println(ch.toString());
        System.out.println();
        System.out.println(ch.charValue());
        System.out.println(ch.compareTo(new MyCharacter('E')));
        MyCharacter.toLowerCase(Character.toLowerCase('F'));
        System.out.println(ch.compareTo(new MyCharacter('a')));
    }
}
