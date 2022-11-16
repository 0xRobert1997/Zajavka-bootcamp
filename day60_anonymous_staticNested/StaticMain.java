package Zajavka.days.day60_anonymous_staticNested;

public class StaticMain {

    public static void main(String[] args) {
        StaticMain.Nested.NestedNested.nestedNestedStaticMethod();
    }

    static class Nested {

        private String nonStaticHello;

        private static String hello = "Nested Hello";

        private static void staticMethod() {
            System.out.println("staticMethod");
        }

        private void nonStaticMethod() {
            System.out.println("nonStaticMethod");
        }


        static class NestedNested {
            private String nestedNestedHello = "nestedNestedHello";

            private static String nestedNestedHelloStatic = "nestedNestedHelloStatic";

            private static void nestedNestedStaticMethod() {
                System.out.println("staticMethod: " + Nested.hello);
            }
        }
    }
}
