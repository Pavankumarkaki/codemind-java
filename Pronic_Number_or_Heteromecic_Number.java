import java.util.Scanner;
class Pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=(int)n/2;i++)
        {
            if(i*(i+1)==n)
            {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}