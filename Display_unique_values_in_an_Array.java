import java.util.Scanner;
class Unique_values
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int s=0;
        for(int e:arr)
        {
            int c=0;
            for(int f:arr)
            {
                if(e==f)
                    c++;
            }
            if(c==1)
                System.out.print(e+" ");
            else
                s++;
        }
        if(s==n)
        System.out.print(-1);
    }
}