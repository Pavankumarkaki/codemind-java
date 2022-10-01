import java.util.Scanner;
class IPaddress
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            System.out.print("[.]");
            else
            System.out.print(s.charAt(i));
        }
    }
}