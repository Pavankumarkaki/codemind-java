import java.util.Scanner;
class Even_aray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int e:arr)
            if(e%2!=0)
            {
                System.out.print("False");
                return;
            }
        System.out.print("True");
    }
}