import java.util.Scanner;
class Unique_even_count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
            if(arr[i]!=-788)
            {
                for(int j=i;j<n;j++)
                    if(i!=j && arr[i]==arr[j])
                        arr[j]=-788;
                if(arr[i]%2==0)
                c++;
            }
        System.out.print(c);   
    }
}