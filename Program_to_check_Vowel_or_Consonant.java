import java.util.Scanner;
class Vowel_consonent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u"))
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Consonant");
        }
    }
}