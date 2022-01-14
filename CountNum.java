import java.util.Scanner;
public class CountNum
{
    public static void main(String[] args)
    {
    System.out.println("welcome to this program");
    System.out.println("enter the user input");
    CountNum a = new CountNum();
    Scanner value = new Scanner(System.in);
    int num1=value.nextInt();    
    System.out.println("total digit in that number"+" "+a.count(num1));
  /*  System.out.println(a.count(77));
    System.out.println(a.count(766));
    System.out.println(a.count(7666));
    System.out.println(a.count(76666));
    System.out.println(a.count(766666));
    System.out.println(a.count(7666666));
*/
    }
    public int count(int num1)
    { 
    int count=0;
    while (num1>0)
    {
        num1=num1/10;
        System.out.println(num1);
        count++;
    }
       return count;
    }
}
