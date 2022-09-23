import java.util.Scanner;
class Elements_greater
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        int s=0,c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        s/=n;
        for(int ele:arr)
            if(ele>=s)
                c++;
        System.out.print(c);
        
    }
}