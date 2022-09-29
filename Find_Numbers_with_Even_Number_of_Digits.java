import java.util.Scanner;
class Even_num_digits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int c=0;
        for(int e:arr)
        {
            int k=(int)Math.log10(e)+1;
            if(k%2==0)
                c++;
        }
        System.out.print(c);
    }
}