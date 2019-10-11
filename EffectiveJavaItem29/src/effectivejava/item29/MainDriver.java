package effectivejava.item29;

public class MainDriver {
    public static void main(String args[]) {
        MyStack s = new MyStack();
        MyStackGeneric<String> s2 = new MyStackGeneric<String>();
        MyStackGenericAlternate<String> s3 = new MyStackGenericAlternate<String>();
        MyStackGenericList<String> s4 = new MyStackGenericList<String>();

        s.push("Hello");
        s2.push("Hello");
        s3.push("Hello");
        s4.push("Hello");

        s.push("World");
        s2.push("World");
        s3.push("World");
        s4.push("World");

        while(!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();

        while(!s2.isEmpty()) {
            System.out.print(s2.pop() + " ");
        }
        System.out.println();

        while(!s3.isEmpty()) {
            System.out.print(s3.pop() + " ");
        }
        System.out.println();

        while(!s4.isEmpty()) {
            System.out.print(s4.pop() + " ");
        }

    }
}