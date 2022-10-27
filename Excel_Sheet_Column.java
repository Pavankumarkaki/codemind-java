import java.util.Scanner;
class Excel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s="";
        int r;
        while(n>0)
        {
            r=n%26;
            if(r==0)
            {
                s+="Z";
                n=(int)(n/26)-1;
            }
            else
            {
                s+=alpha.charAt(r-1);
                n=n/26;
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}