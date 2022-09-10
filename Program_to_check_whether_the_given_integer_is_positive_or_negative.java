import java.util.Scanner;
class Pos_neg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Positive Number");
        }
        sc.close();
    }
}