import java.util.Scanner;


public class SmallProjectOfPrimeNumbers
{
    static String [] name={"yes"};

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----------WELCOME----------");
        System.out.println("Enter any Positive integer number:");
        checkPrime();
    }
    public static boolean isPrimeNumber(int x)
    {
        for(int i=2;i<=x/2;)
        {
            if(x%i==0)
                return false;
            break;
        }
        return true;
    }
    static void checkAnotherNumber()
    {
        System.out.println("If you want to Exit than Enter Yes/ If you don't want to Exit than Enter anything except yes:");
        String string = sc.next().toLowerCase();
        if(name[0].equals(string))
        {
            System.out.println("Thank you!");
        }
        else{
            System.out.println("If you want check another number than Enter:");
            checkPrime();
        }
    }
    static void checkPrime() {
        {
            int num = sc.nextInt();
            if (num>1&&isPrimeNumber(num)) {
                System.out.println(num + "  is Prime number");
            } else {
                System.out.println(num + " is Not Prime number");
            }
            checkAnotherNumber();
        }
    }
}


