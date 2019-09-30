class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char[] charArrayFromString1 =  s.toCharArray();
		char[] charArrayFromString2 =  t.toCharArray();

		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);

		if(!Arrays.equals(charArrayFromString1, charArrayFromString2))
		{
			return false;
		}
		return true;
        
    }
}