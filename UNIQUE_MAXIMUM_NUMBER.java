import java.util.Scanner;
class Uniq_max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int uniq[]=new int[100];
        int k=-1;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                    c++;
            }
            if(c==1)
            {
                uniq[++k]=arr[i];
            }
        }
        //System.out.print(k);
        if(k==-1)
            System.out.print(k);
        else
        {
            int m=0;
            for(int i=0;i<=k;i++)
            {
                if(uniq[i]>m)
                    m=uniq[i];
            }
            System.out.print(m);
        }
    }
}