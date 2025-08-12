package _11_ParametersAndConstructors;

public class OOP4 {

    int a = 0;
    static int b = 20;
    static  void m2() {
//        System.out.println(a,b);
    }
    void m1() {
        System.out.println(a +" " +b);
    }
    public static void main(String[] args) {
        OOP4 obj= new OOP4();
        obj.m1();
        OOP4.m2();
    }
}
