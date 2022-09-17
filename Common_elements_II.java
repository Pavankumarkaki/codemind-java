import java.util.Scanner;
class Common_ele
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []a=new int[n];
        int []b=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int c[]=new int[100];
        int k=-1;
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                    s=1;
            }
            if(s==0)
                c[++k]=a[i];
        }
        for(int i=0;i<m;i++)
        {
            int s=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==b[i])
                    s=1;
            }
            if(s==0)
                c[++k]=b[i];
        }
        for(int i=0;i<=k;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}