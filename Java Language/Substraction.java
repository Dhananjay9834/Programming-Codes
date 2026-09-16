class Substraction
{
  public int Sub(int a, int b)
  {
     int result = 0;
      result = a-b;
      return result;
  }
  public static void main(String args[])
  {
    int x = 21;
    int y = 11;
    int result = Sub(x,y);
    System.out.println("Substraction is :- "+result);
    
  }
}
