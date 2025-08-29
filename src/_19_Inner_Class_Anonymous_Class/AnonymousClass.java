package _19_Inner_Class_Anonymous_Class;
// Anonymous Inner class
//Lambda Expression
interface Project
{
    void task1(int a);
}

class AnonymousClient
{
    public static void main(String[] args)
    {
	Project p=new Project(){
			public void task1(int a)
			{
				System.out.println(a++);
			}
		};
	p.task1(2);

	/*
		Lambda Expression "->"
		we have to work with Functional Interface
		Functional Interface-> inteface contain single abstract method.
	*/

        Project p1= (int a) -> System.out.println("Value from parameter: " + a);

        p1.task1(5);
    }
}