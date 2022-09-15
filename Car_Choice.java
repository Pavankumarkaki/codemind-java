import java.util.Scanner;
class Car
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            float c1=(float)y1/x1;
            float c2=(float)y2/x2;
            if(c1<c2)
            {
                System.out.println("-1");
            }
            else if(c1>c2)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
    }
}