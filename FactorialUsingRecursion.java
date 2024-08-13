import java.util.Scanner;

public class FactorialUsingRecursion
{
    public static void main(String[] args)
        {
            System.out.println("enter factorial from which number you want:");

            int number = new Scanner(System.in).nextInt();

            if(number < 0) {
                System.out.println("Please Enter only positive integer");
            }
            System.out.println("Factorial of "+number+" is:"+calculateFactorial(number));

        }
        public static int calculateFactorial( int number)
        {
            if(number == 0) {
                return 1;
            }
            return number*calculateFactorial(number-1);
        }
    }/*



//---------second method----

    /*public static void main(String[] args) {
        System.out.println("enter from which factorial you want:");
        int num= new Scanner(System.in).nextInt();

        int fact=1;
        for(int i=2;i<=num;i++)
        {
            fact= fact*i;
            System.out.println(fact);
        }
    }

}*/

