import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{
    System.out.println("welcome to this program");
    Scanner obj1 = new Scanner(System.in);
    int num1= obj1.nextInt();
    System.out.println("your value is"+" "+num1);
    Factorial.function(num1);
    
}
 static void function(int num1)
{  int total = 1; 
    while(num1>0)
    {    
    total=total*num1;
    num1--;
    }
    System.out.println("factorial of given number"+" "+total);
}
}
