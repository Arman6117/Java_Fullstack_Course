package _10_OOPS;

class D
{
    private int a=10;
    private String b="hello";
    private float c=97.0009f;
    private boolean d=true;

    protected void task1()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class OOPS2
{
    public static void main(String[] args)
    {
        D obj=new D();

        obj.task1();

    }
}