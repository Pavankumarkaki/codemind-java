import java.util.Scanner;
class Grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int h,spin,speed;
        h=sc.nextInt();
        spin=sc.nextInt();
        speed=sc.nextInt();
        if(h>50 && spin>60 && speed>100)
        {
            System.out.println("10");
        }
        else if(h>50 && spin>60 && speed<100)
        {
            System.out.println("9");
        }
        else if(h<50 && spin>60 && speed>100)
        {
            System.out.println("8");
        }
        else if(h>50 && spin<60 && speed>100)
        {
            System.out.println("7");
        }
        else if(h>50 || spin>60 || speed>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}