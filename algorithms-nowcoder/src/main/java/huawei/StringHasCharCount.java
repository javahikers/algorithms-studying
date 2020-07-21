package huawei;
import java.util.Scanner;

public class StringHasCharCount{
    public static void main(String [] arg)
    {
        Scanner s  = new Scanner(System.in);
        String str = s.next();
        char c = s.next().charAt(0);
        int i = getCount(str, c);
        System.out.println(i);
    }
    public static int getCount(String str, char c)
    {
        int count = 0;
        if(str == null || "".equals(str))
        {
            return count;
        }
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == c)
            {
                count ++;
            }
        }
        return count;
    }
}
