public class Swap2No
{
public static void main(String[] args)
{
    int a=12;           //using third variable
    int b=20;
   int c;
    System.out.println("Value of a is,before swapping:"+" "+a); 
    System.out.println("Value of b is,before swapping:"+" "+b); 
  /*  c= a;
    a=b;
    b=c;
    System.out.println("Value of a is,after swapping:"+" "+a); 
    System.out.println("Value of b is,after swapping:"+" "+b); 
    */
    System.out.println("without third variable");
    a=a*b;
    b=a/b;
    a=a/b;    
/*  a=a+b;
    b=a-b;
    a=a-b;*/
    System.out.println("Value of a is,after swapping:"+" "+a); 
    System.out.println("Value of b is,after swapping:"+" "+b); 
     
}
}
