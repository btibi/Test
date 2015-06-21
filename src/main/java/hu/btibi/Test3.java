package hu.btibi;

public class Test3 {

    public static void main(String[] args) {
        Parent instance = new Child();

        instance.modify();

        System.out.println(instance.number);
    }

    private static class Parent {

        int number;

        protected void modify() {
            number--;
        }

    }

    private static class Child extends Parent {
        public void modify() {
            number++;
        }
    }
}
