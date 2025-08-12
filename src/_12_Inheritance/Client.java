package _12_Inheritance;

class ExistingProject
{
    int a, b;
    public ExistingProject(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public void task()
    {
        System.out.println(a+b);
    }
}
class NewProject extends ExistingProject
{
    public NewProject(int a, int b)
    {
        super(a,b);
    }
}
class Client
{
    public static void main(String [] args)
    {
        NewProject np=new NewProject(20, 50);
        np.task();
    }
}


// this -> this keyword is used for current class reference
// super -> super keyword is used for super/parent class reference