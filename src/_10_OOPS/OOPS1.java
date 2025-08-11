package _10_OOPS;
class A
{
    int a=10;
    void task1()
    {
        System.out.println("Square of number: "+  a*a);
    }
}
class B
{
    int b=20;
    void task2()
    {
        System.out.println("Cube of number: "+ b*b*b);
    }
}
class C
{
    int c=25;
    void task3()
    {
        System.out.println("Square root of number: "+  Math.sqrt(c));
    }
}
class OOPS1
{
    public static void main(String[] args)
    {
		/*
		A obj1;		// declaration of object
		obj1=new A();	// Intialization of object
		*/
        A obj1=new A();
        obj1.task1();
        B obj2=new B();
        obj2.task2();
        C obj3=new C();
        obj3.task3();

    }
}