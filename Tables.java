import java.util.Scanner;
class Tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=1;i<=y;i++)
        {
            if(i%2!=0)
            System.out.println(x+" x "+i+" = "+ x*i);
        }
    }
}