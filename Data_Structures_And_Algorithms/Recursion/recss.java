import java.util.*;

public class recss
{
    // abc -> [---, --c, -b-, -bc, a--, a-c, ab-, abc]
    static ArrayList<String> getss(String s)
    {
        if(s.length() == 0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = s.charAt(0);
        String ros = s.substring(1, s.length());
        ArrayList<String> rres = getss(ros);
        ArrayList<String> mres = new ArrayList<>();

        for(int i = 0; i < rres.size(); i++)
        {
            String rstr = rres.get(i);
            mres.add('-' + rstr);
            mres.add(ch + rstr);
        }

        return mres;
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = getss("abcd");
        System.out.println(list);
    }
}