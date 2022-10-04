import java.util.Scanner;
class HomeWork
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int start[]=new int[s];
        for(int i=0;i<s;i++)
            start[i]=sc.nextInt();
        int e=sc.nextInt();
        int end[]=new int[e];
        for(int i=0;i<e;i++)
            end[i]=sc.nextInt();
        int q=sc.nextInt();
        int c=0;
        for(int i=0;i<s;i++)
        {
            if(q>=start[i] && q<=end[i])
                c++;
        }
        System.out.print(c);
        
    }
}