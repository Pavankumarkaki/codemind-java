import java.util.Scanner;
class Max_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int m=0;
        int l=0;
        for(int i:arr)
        {
            if(i==1)
                m++;
            else
            {
                if(m>l)
                    l=m;
                m=0;
            }
        }
        if(m>l)
        l=m;
        System.out.print(l);
    }
}