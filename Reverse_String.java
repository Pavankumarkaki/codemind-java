import java.util.Scanner;
class Reverse_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String st[]=s.split(" ");
        //System.out.print(s);
        for(int i=st.length-1;i>-1;i--)
            System.out.print(st[i]+" ");
    }
}