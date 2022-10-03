import java.util.Scanner;
class Sum_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                v+=s.charAt(i)-'0';
        }
        System.out.print(v);
    }
}