public class SumDigitOfNum
{
public static void main(String[] args)
{
SumDigitOfNum obj= new SumDigitOfNum();
          // System.out.println( obj.function(12));
          // System.out.println( obj.function(153));
          // System.out.println( obj.function(1550));
           System.out.println( obj.function(856));
           //System.out.println( obj.function(150));
}
public int function(int num)
{   int sum=0;
    while(num>0)
    {   
    int remainder=num%10;
           System.out.println( "rr"+remainder);
    sum+=remainder;
           System.out.println("sum"+sum);
    num=num/10;
    }
    return sum;
}
}
