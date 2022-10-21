import java.util.Scanner;
class Count{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int e=0,o=0;
        for(int ele:arr)
        {
            if(ele%2==0)
                e++;
            else
                o++;
        }
        System.out.println(e+" "+o);
    }
}