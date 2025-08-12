package _12_Inheritance;

public class IS_A_Relation {
    public static void main(String[] args) {

        //IS_A relation
        CC obj = new CC();
        obj.t1();
        obj.t2();
        obj.t3();

    }
}

class AA{
    int a;

    public AA() {
        a = 10;
    }
    void t1() {
        System.out.println(a);
    }
}
class BB extends AA {
    int a;
    public BB(){
        a = 20;
    }
    void t2(){
        System.out.println(a);
    }
}
class CC extends BB {
    int a;
    public CC() {
        a = 30;
    }
    void t3() {
        System.out.println(a);
    }
}