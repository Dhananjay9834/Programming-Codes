class Base
{
    public int i,j;

    public Base()
    {
        System.out.println("Inside Base Constructor..");
    }

    public void Fun()
    {
        System.out.println("Inside Base Fun..");
    }

    public void Gun()
    {
        System.out.println("Inside Base Gun..");
    }
}

class Derived extends Base
{
    public int x,y;

    public Derived()
    {
        System.out.println("Inside Derived Constructor..");
    }

    public void Sun()
    {
        System.out.println("Inside Derived Sun..");
    }    
}

class DerivedX extends Derived
{
    public int a;

    public DerivedX()
    {
        System.out.println("Inside DerivedX Constructor..");
    }

    public void Run()
    {
        System.out.println("Inside DerivedX Run..");
    }
}

class Multilevel
{
    public static void main(String A[])
    {
        DerivedX dobj = new DerivedX();

        dobj.Fun();
        dobj.Run();
        dobj.Gun();
        dobj.Sun();
    }
}
