import java.util.Scanner;
class Happy_num
{
    public static boolean ishappy(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=(int)Math.pow(n%10,2);
            n/=10;
        }
        if(s<10)
        {
            if(s==1 || s==7)
                return true;
            else
                return false;
        }
        else{
            return ishappy(s);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(ishappy(n))
        {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}