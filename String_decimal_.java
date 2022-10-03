import java.util.Scanner;
class String_digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String sp=sc.nextLine();
        for(int k=0;k<t;k++)
        {
            String s=sc.nextLine();
            int c=0;
            for(int i=0;i<s.length();i++)
            {
                if(Character.isDigit(s.charAt(i)))
                    c++;
            }
            if(c==s.length())
            System.out.println("True");
            else
            System.out.println("False");
        }
        
    }
}