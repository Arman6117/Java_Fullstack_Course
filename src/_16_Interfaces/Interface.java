package _16_Interfaces;

interface I1{
    void m1();
}
interface I2 extends I1{
    void m2();
}

interface Area  {
    float PI = 3.14f;
    float areaOfCircle();
    int areaOfSquare();
}

class  FindArea implements  Area  {
   private float r;
  private   int side;
    public  FindArea(float r, int side) {
        this.r = r;
        this.side = side;
    }
    public int areaOfSquare() {
        return side*side;
    }

    public float areaOfCircle() {
        return PI * r * r;
    }
}
class Subclass implements I1, I2{
    public void m1(){
        System.out.println("Method of Interface 1");
    }
    public void m2(){
        System.out.println("Method of Interface 2");
    }
}
public class Interface {
    public static void main(String[] args) {
        I1 obj = new Subclass();
        obj.m1();

        FindArea obj2 = new FindArea(4.2f,2);
        System.out.println(obj2.areaOfSquare());
        System.out.println(obj2.areaOfCircle());

        I2 obj1 = new Subclass();
        obj1.m1();
        obj1.m2();
    }
}