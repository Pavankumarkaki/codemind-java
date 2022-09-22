import java.util.Scanner;
class Uniq_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=(int)Math.log10(n);
        int arr[]=new int[d+1];
        int i=-1,s=d;
        while(n>0)
        {
            int r=n/(int)Math.pow(10,d);
            n=n%(int)Math.pow(10,d);
            arr[++i]=r;
            d--;
        }
        for(i=0;i<s-1;i++)
        {
            for(int j=i+1;j<s;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print("Not Unique Number");
                    return;
                }
            }
        }
        System.out.print("Unique Number");
    }
}