import java.util.Arrays;

class Solution
{
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b)
    {
        char x[] = a.toCharArray();
        char y[] = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(x.length != y.length) return false;
        for(int i = 0; i < x.length; i++) {
            if(x[i] != y[i]) return false;
        }
        return true;
    }
}
