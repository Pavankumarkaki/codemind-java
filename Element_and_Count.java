import java.util.Scanner;
class ele_same_count
{
    public static int count(int n,int arr[])
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
                c++;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int b[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            int f=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                b[index++]=arr[i];
            }
        }
        int c=0;
        for(int i=0;i<index;i++)
        {
            System.out.print(b[i]+" "+count(b[i],arr)+" ");
        }
    }
}