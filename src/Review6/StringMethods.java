package Review6;

public class StringMethods {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));
       String newString= str.concat(" World");
        System.out.println(newString);
        System.out.println(str);
       str=str.toUpperCase();
        System.out.println(str);

        str.isEmpty();//This creates a new string object because strings are immutable
    }
}
