class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c=s.toCharArray();
        char[] f=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(f);
        return Arrays.equals(c,f);

    }
}
