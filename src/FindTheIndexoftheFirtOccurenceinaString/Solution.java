package FindTheIndexoftheFirtOccurenceinaString;

class Solution {
    public int strStr(String haystack, String needle) {
        String check;
        int size = needle.length();
        if(haystack.equals(needle)){
            return 0;
        }
        for(int i=0; i <= haystack.length() - size; i++ ){
            check = haystack.substring(i,i+size);
            if( check.equals(needle) ){
                return i;
            }
        }
        return -1;

    }
}

class Solution2{
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }


}