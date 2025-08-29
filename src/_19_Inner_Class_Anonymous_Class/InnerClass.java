package _19_Inner_Class_Anonymous_Class;


//Normal Inner class Example
class A
{
    int a=5;
    void task1()
    {
        System.out.println(a*a);
    }
    static class B
    {
        int b=6;
        void task2()
        {
            System.out.println(b+b);
        }
    }
}
class NormalInner
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj.task1();
        //obj.task2();	//error

        A.B obj2=new A.B();
        obj2.task2();
        //obj2.task1();	//error
    }
}