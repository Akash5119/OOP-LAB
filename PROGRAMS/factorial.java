import java.util.Scanner;
class Fact {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number");
        int num=input.nextInt();
        int i,fact=1;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}