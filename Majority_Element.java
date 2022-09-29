import java.util.Scanner;
class Majority_element
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i:arr)
        {
            int c=0;
            for(int j:arr)
            {
                if(i==j)
                c++;
            }
            if(c>(n/2))
            {
                System.out.print(i);
                return;
            }
        }
    }
}