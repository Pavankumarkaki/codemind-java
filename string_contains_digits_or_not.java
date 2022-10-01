import java.util.Scanner;
class Digit_orNot
{
    public static boolean isdigit(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s=sc.nextLine();
        for(int i=0;i<t;i++)
        {
            s=sc.nextLine();
            if(isdigit(s))
            System.out.println("Yes");
            else
            System.out.println("No");
            //System.out.println(s);
        }
    }
}