package _15_Abstract_Overriding;

abstract class Development{
    public  abstract void develop();
    //Tightly Coupled Development

    public void task1(){     //lossely coupled Development
        System.out.println("Task from abstract class(super class)");
    }
}


class Implement extends Development{
    public void develop(){//Tightly Coupled Development
        System.out.println("Method from Implement class(subClass)");
    }
    public void task2(){         //loselly coupled Development
        System.out.println("Method from Implement class(sub class)");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
//            Development obj = new Development();          super class
//            Development class is abstract class means its empty no method will run
//            obj.develop();
//                obj.task();

        Development obj = new Implement();  //
        obj.develop();                                      //override
        obj.task1();                                           //

        Implement obj1 = new Implement();
        obj1.develop();
        obj1.task2();
    }

}