class Base
{ 
    int i,j;
    void fun()
    {   System.out.print("Base fun\n"); }
    void gun()
    {   System.out.print("Base gun\n"); }
    void sun()
    {   System.out.print("Base sun\n"); }
    void run()
    {   System.out.print("Base run\n"); }
}

class Derived extends Base
{
    int x;
    void fun()
    {   System.out.print("Derived fun\n"); }
    void sun()
    {   System.out.print("Derived sun\n"); }
    void mun()
    {   System.out.print("Derived mun\n"); }
    void bun()
    {   System.out.print("Derived bun\n"); }
}

class VirtualDemo5
{
    public static void main(String A[])
    {
         Base bp = new Derived();

        bp.fun();
        bp.gun();
        bp.sun();
        bp.run();
        //bp.mun();  //Error
        //bp.bun();  // Error
    }
}