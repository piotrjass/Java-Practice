// url https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class Task31 {

    public static void main(String[] args) {
//        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr2("sadbutsad", "sad"));
    }
    public static int strStr(String haystack, String needle) {

        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }

    // clever

    public static int strStr2(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){

            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
