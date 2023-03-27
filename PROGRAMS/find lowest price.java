import java.util.Scanner;
class Product{
    String pname;
    int pcode;
    int price;
    void display()
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter product names:");
        pname=input.next();
        System.out.println("Enter product code:");
        pcode=input.nextInt();
        System.out.println("Enter product price:");
        price=input.nextInt();
    }
}
class Main
{
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        p1.display();
        p2.display();
        p3.display();
        if(p1.price<p2.price)
        {
           System.out.println("product1 is lowest");
        }
        else if( p2.price<p3.price)
        {
            System.out.println("product2 is lowest");
        }
        else
        {
            System.out.println("product3 is lowest");
        }
    }
}