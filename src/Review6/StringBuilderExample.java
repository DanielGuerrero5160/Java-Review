package Review6;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Today is thursday");
        sb.reverse();
        System.out.println(sb);//since stringbuilder is mutable, when we print sb. it will be the reversed string

        String revString=sb.toString();///converting stringbuilder back into string.
        System.out.println(revString);
        revString.toUpperCase();
        System.out.println("***********");
        System.out.println(revString);//This proves that strings are immutable
        }

    }


