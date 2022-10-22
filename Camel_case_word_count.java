import java.util.Scanner;
class CamelCase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        //System.out.println(ch.length);
        for(int i=1;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                c++;
            //System.out.println(cr);
        }
        System.out.println(c+1);
    }
}