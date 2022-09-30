import java.util.Scanner;
class Count_char
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0,d=0,sp=0;
        String vowel="AEIOUaeiou";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                if(vowel.contains(String.valueOf(ch)))
                    v++;
                else
                    c++;
            }
            else if(Character.isDigit(ch))
                d++;
            else
                sp++;
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+sp);
    }
}