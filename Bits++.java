import java.util.Scanner;
class Bit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int val=0;
         String k=sc.nextLine();
        for(int i=0;i<t;i++)
        {
            String s=sc.nextLine();
            if(s.charAt(0)=='+')
                ++val;
            else if(s.charAt(0)=='-')
                --val;
            else if(s.charAt(1)=='+')
                val++;
            else
                val--;
        }
        System.out.print(val);
    }
}