package hu.btibi;

public class Test2 {

    public static void main(String[] args) {
        int i = 1;
        String s = "This is";
        StringBuilder sb = new StringBuilder(" a valid");

        doSomething(i, s, sb);

        System.out.println(s + sb.toString() + i + "!");
    }

    private static void doSomething(int i, String s, StringBuilder sb) {
        i = i + Integer.MAX_VALUE;
        s = s + " not";
        sb.append(" input: ");
    }
}
