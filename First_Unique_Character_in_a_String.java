import java.util.Scanner;
class Uniq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int c=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                    c++;
            }
            if(c==1)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}