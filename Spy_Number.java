import java.util.Scanner;
class Spy_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,sum=0,pro=1;
        while(temp>0){
            int r=temp%10;
            sum+=r;
            pro*=r;
            temp/=10;
        }
        if(sum==pro){
            System.out.print("Spy Number");
        }
        else{
            System.out.print("Not Spy Number");
        }
    }
}