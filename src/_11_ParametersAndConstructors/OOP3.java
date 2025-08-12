package _11_ParametersAndConstructors;

class Test
{
    int a,b,c;

    public Test(int a, int b)  //Constructor with Acutal Parameters
    {
        this.a=a;
        this.b=b;
    }
    public Test(int x, int y, int z)	//Constructor with Formal Parameters
    {
        a=x;
        b=y;
        c=z;
    }
    public Test()
    {
        //a=5;
        //b=6;
        //c=7;
    }

    void task1()
    {
        System.out.println(a+b);
    }
    void task2()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class OOP3
{
    public static void main(String []args)
    {
        Test t=new Test(10,20);
        t.task1();

        t.task2();

        System.out.println("----------------------");
        Test t1=new Test(20,30,40);
        t1.task1();

        t1.task2();

        System.out.println("----------------------");

        Test t2=new Test();
        t2.task1();

        t2.task2();



    }
}