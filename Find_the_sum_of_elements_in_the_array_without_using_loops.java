import java.util.Scanner;
class Sum_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int [] arr= new int[100];
        int n=sc.nextInt();
        int s=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        System.out.println(s);
    }
}