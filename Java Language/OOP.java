class Arithematic
{
    public int No1;
    public int No2;

    // Default Constructor
    Arithematic()
    {
        No1 = 0;
        No2 = 0;
    }

    // Parameterized Constructor
    Arithematic(int i, int j)
    {
        No1 = i;
        No2 = j;
    }
}

class OOP
{
    public static void main(String[] args)
    {
        Arithematic aobj1 = new Arithematic();

        Arithematic aobj2 = new Arithematic(10, 11);

        System.out.println(aobj1.No1);
        System.out.println(aobj1.No2);

        System.out.println(aobj2.No1);
        System.out.println(aobj2.No2);
    }
}