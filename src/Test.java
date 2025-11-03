public class Test {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void c() {
                System.out.println("Abstract class created");
                System.out.println(this.getClass());
            }
        };

        abstractClass.c();
    }
}

abstract class AbstractClass {
    int a;
    int b;

    abstract void c();
}