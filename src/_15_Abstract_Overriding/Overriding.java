package _15_Abstract_Overriding;

class SuperClass {
    public void task1(){
        System.out.println("Task 1 method from super class");
    }
}
class SubClass extends SuperClass
{
    public void task1(){
        System.out.println("Task 1 method from sub class");
    }
}
class OverRide{
    public static void main(String[] args) {
        //override
        SuperClass obj = new SubClass();
        obj.task1();
        //o/p from sub class

    }
}

//OverRide
// 1. we require superclass  and subclass
//2. we require same access modifier , same return type, same method name
//        and same parameter
//3. to do override we have to create obj of shared memory