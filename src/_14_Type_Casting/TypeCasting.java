package _14_Type_Casting;

class Test {
    void implicit () {
        //Lower datatype value to higher data type reference
        char c = 'C';
        int b = c;
        System.out.println("Implicit casting: " + b);
    }

    void explicit() {
        //Higher data type value to lower type reference
        int c = 90;
        char y  = (char)c;
        System.out.println("Explicit casting: "+y);
    }
}
public class TypeCasting {
    public static void main(String[] args) {
        Test t = new Test();
        t.explicit();
        t.implicit();
    }
}
