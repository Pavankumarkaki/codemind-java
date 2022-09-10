import java.util.Scanner;
class Rain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        if(n%3==0)
        {
            s+="Pling";
        }
        if(n%5==0)
        {
            s+="Plang";
        }
        if(n%7==0)
        {
            s+="Plong";
        }
        if(n%3==0 || n%5==0 ||n%7==0)
        {
            System.out.println(s);
        }
        else
        {
            System.out.println(n);
        }
    }
}