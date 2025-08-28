package _18_Return_Type;

public class Development {
    public  void task1(int a, int b) {
        System.out.println(a+b);
    }
    public int task2(int x,int y) {
        return x+y;
    }
}

class  ReturnExample {
    public static void main(String[] args) {
        Development d = new Development();
        d.task1(2,3);
        int sum =d.task2(3,9);
        System.out.println(sum);
    }
}
