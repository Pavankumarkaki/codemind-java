import java.util.Scanner;
class Excel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        while (n>0)
        {
            int r=n%26;
            if(r==0)
            {
                s+="Z";
                n=(int)(n/26)-1;
            }
            else
            {
                s+=String.valueOf((char)(64+r));
                n=n/26;
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}