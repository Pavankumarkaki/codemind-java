import java.util.Scanner;
class Phone_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        //System.out.print(n);
        if(n<9999999999L && n>1000000000L)
        {
            System.out.print("Valid");
        }
        else{
            System.out.print("Invalid");
        }
    }
}