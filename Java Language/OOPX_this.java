class Arithematic
{
    public int No1;
    public int No2;

    // Default Constructor
    Arithematic()
    {
        this.No1 = 0;
        this.No2 = 0;
    }

    // Parameterized Constructor
    Arithematic(int i, int j)
    {
        this.No1 = i;
        this.No2 = j;
    }

    int Addition()
    {
        int Ans = 0;
        Ans = this.No1 + this.No2;
        return Ans;
    }
}

class OOPX_this
{
    public static void main(String[] args)
    {
        Arithematic aobj1 = new Arithematic(10, 11);

        int Result = 0;

        Result = aobj1.Addition();

        System.out.println("Addition is : " + Result);
    }
}

