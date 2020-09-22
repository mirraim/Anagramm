package Anagram;


public class Main {
    public static void main( String[] args ){
        Anagram test = new Anagram("abcd efgh");
        System.out.println(test.toString());
        test.setReportedText("a1bcd efg!h");
        System.out.println(test.toString());
    }
}
