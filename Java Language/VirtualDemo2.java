class Base
{ 
    int i,j;
    void fun()
    {   System.out.println("Inside fun of Base");   }
}

class Derived extends Base
{
    int x;
    void fun()
    {   System.out.println("Inside fun of Derived");    }
}

class VirtualDemo2
{
    public static void main(String A[])
    {
        Base bp = new Derived();      // Upcasting

        bp.fun();                      // Base fun
    }
}