package _19_Inner_Class_Anonymous_Class;


interface Operations {
    int sum(int a, int b);

    int sub(int a, int b);
}

public class Example {
    public static void main(String[] args) {
        Operations o = new Operations() {
            public int sum(int a, int b) {
                return a + b;
            }
            public int sub(int a, int b) {
                return a - b;
            }
        };
        System.out.println("Addition: " + o.sum(5,5));
        System.out.println("Subtraction: " + o.sub(10,5));
    }

}
