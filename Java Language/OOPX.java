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

    int Addition()
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }
}

class OOPX
{
    public static void main(String[] args)
    {
        Arithematic aobj1 = new Arithematic(10, 11);

        int Result = 0;

        Result = aobj1.Addition();

        System.out.println("Addition is : " + Result);
    }
}