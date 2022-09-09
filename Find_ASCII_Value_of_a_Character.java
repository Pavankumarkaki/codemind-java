import java.util.Scanner;
class asci
{
    public static void main(String args[])
    {
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextLine().charAt(0);
        System.out.println((int)c);
        sc.close();
    }
}