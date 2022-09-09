import java.util.Scanner;
class handshakes
{
    public static void main(String args[])
    {
        int a,mhs=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=1;i<a;i++)
        {
            mhs=mhs+i;
        }
        System.out.println(mhs);
        sc.close();
    }
}