import java.util.Scanner;
class Reverse_charInWords
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++)
        {
            for(int j=words[i].length()-1;j>-1;j--)
            {
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}