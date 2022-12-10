import java.util.*;
class Balanced
{
    public static boolean bal(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' ||s.charAt(i)=='[' ||s.charAt(i)=='{')
                st.push(s.charAt(i));
            else
            {
                if(st.isEmpty())
                    return false;
                else
                {
                    if( s.charAt(i)==')' && st.peek()!='(')
                        return false;
                    if( s.charAt(i)==']' && st.peek()!='[')
                        return false;
                    if( s.charAt(i)=='}' && st.peek()!='{')
                        return false;
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(bal(s))
            System.out.println("True");
        else
            System.out.println("False");
    }
}