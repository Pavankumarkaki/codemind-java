import java.util.Scanner;
class tempconvert
{
    public static void main(String args[])
    {
        int c;
        float f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=32+(float)(c*9/5.0);
        System.out.format("%.2f",f);
        sc.close();
    }
}
