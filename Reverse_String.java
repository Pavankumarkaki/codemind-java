import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=s.length()-1;i>-1;i--)
            System.out.print(s.charAt(i)+"");
    }
}