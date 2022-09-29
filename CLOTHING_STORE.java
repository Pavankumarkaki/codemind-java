import java.util.Scanner;
class Cloth_Store
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int p=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=0)
            {
                int c=1;
                for(int j=i+1;j<n;j++)
                {
                    if (arr[i]==arr[j])
                    {
                        c++;
                        arr[j]=0;
                    }
                }
                p+=c/2;
            }
            
        }
        System.out.print(p);
    }
}