import java.util.Scanner;
class Maxof_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)>max)
                max=s.charAt(i);
        }
        System.out.print((char)max);
    }
}