// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main
{
    public static void main(String [] args)
    {
    int l,w,a;
    double r,b,h;
    Function obj=new Function();
    Scanner input =new Scanner(System.in);
    System.out.println("enter the length of the rectangle:");
    l=input.nextInt();
      System.out.println("enter the breadth of the rectangle:");
    w=input.nextInt();
      System.out.println("area of rectangle:"+obj.area(l,w));
      
      System.out.println("enter the radius of circle:");
    r=input.nextDouble();
          System.out.println("area of circle:"+obj.area(r));
          
           System.out.println("enter the side of square:");
    a=input.nextInt();
          System.out.println("area of square:"+obj.area(a));
          
        System.out.println("enter the base of the triangle:");
    b=input.nextInt();
        System.out.println("enter the height of the triangle:");
    h=input.nextInt();
       System.out.println("area of triangle:"+obj.area(b,h));
   }
}
class Function
{
    public int area(int l,int w)
    {
        return l*w;
    }
    public double area(double r)
    {
        return 3.141*r*r;
    }
    public int area(int a)
    {
        return a*a;
    }
     public double area(double b,double h)
    {
        return 0.5*b*h;
    }
}