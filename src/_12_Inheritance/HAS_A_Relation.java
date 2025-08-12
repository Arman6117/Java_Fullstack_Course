package _12_Inheritance;

public class HAS_A_Relation {
    public static void main(String[] args) {

        //HAS_A Relation (create obj and call)
        A obj = new A();
        obj.t1();

        B obj1 = new B();
        obj1.t2();

        C obj2 = new C();
        obj2.t3();

    }
}
class A{
    int a;
    public A(){
        a = 10;
    }
    void t1(){
        System.out.println(a);
    }
}
class B{
    int a;
    public B(){
        a = 20;
    }
    void t2(){
        System.out.println(a);
    }
}
class C{
    int a;
    public C(){
        a = 20;
    }
    void t3(){
        System.out.println(a);
    }
}