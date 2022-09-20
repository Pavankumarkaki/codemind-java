import java.util.Scanner;
class Num_space
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==i ||j==(n+1)-i)
                {
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}