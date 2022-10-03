import java.util.Scanner;
class Robot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int arr[]={0,0,0,0};
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='U')
                arr[0]++;
            else if(ch=='D')
                arr[1]++;
            else if(ch=='R')
                arr[2]++;
            else if(ch=='L')
                arr[3]++;
        }
        if(arr[0]==arr[1] && arr[2]==arr[3])
            System.out.print("True");
        else if(arr[2]==arr[3] && arr[0]==0 &&arr[1]==0)
            System.out.print("True");
        else if(arr[0]==arr[1] && arr[2]==arr[1] &&arr[3]==arr[2])
            System.out.print("True");
        else
        System.out.print("False");
    }
}