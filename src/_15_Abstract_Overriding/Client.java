package _15_Abstract_Overriding;

class Manager {
    public void task(int x){
        //empty logics
    }
}
class Developer extends Manager{
    public void task(int x){
        System.out.println("Square of number");
        System.out.println(Math.sqrt(x));
    }
}
class Developer1 extends Developer{
    public void task(int x){
        System.out.println("Cube of a number");
        System.out.println(x * x * x);
    }
}
class Developer2 extends Developer1{
    public void task(int x){
        System.out.println("Square of a number");
        System.out.println(x * x);
    }
}
class Client {
    public static void main(String[] args) {
        Manager obj = new Developer();
        obj.task(9);
        Manager obj1 = new Developer1();
        obj1.task(9);
        Manager obj2 = new Developer2();
        obj2.task(9);
    }
}