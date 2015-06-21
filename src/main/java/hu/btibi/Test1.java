package hu.btibi;

public class Test1 {

    public static void main(String[] args) {

        String s1 = "string";
        String s2 = "string";
        System.out.println("------String1------");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        String s3 = new String("string");
        String s4 = new String("string");
        System.out.println("------String2------");
        System.out.println(s3 == s4);
        System.out.println(s2.equals(s4));


        StringBuilder sb1 = new StringBuilder("stringBuilder");
        StringBuilder sb2 = new StringBuilder("stringBuilder");
        System.out.println("------StringBuilder------");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));


        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println("------Integer------");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));


        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);
        System.out.println("------Integer.valueOf------");
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));


        Integer i5 = Integer.valueOf(128);
        Integer i6 = Integer.valueOf(128);
        System.out.println("------Integer.valueOf2------");
        System.out.println(i5 == i6);
        System.out.println(i5.equals(i6));
    }


}
