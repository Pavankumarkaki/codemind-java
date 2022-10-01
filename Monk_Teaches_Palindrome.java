import java.util.Scanner;
class Palindrome_EveOdd
{
    public static boolean ispal(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s=sc.nextLine();
        for(int i=0;i<t;i++)
        {
            s=sc.nextLine();
            if(ispal(s))
            {
                String res="";
                if(s.length()%2==0)
                res+="EVEN";
                else
                res+="ODD";
                System.out.println("YES "+res);
                
            }
            else
            System.out.println("NO");
            
        }
    }
}