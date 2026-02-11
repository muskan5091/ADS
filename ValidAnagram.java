class  {
    public boolean isAnagram(String s, String t) {
    //   if(s.length()!=t.length())
    //   return false;
    //   char sarr[] =s.toCharArray();
    //    char tarr[] =t.toCharArray();
    //    Arrays.sort(sarr);
    //    Arrays.sort(tarr);          time complexity - zyda hai 
    //    return Arrays.equals(sarr, tarr);

       if(s.length()!=t.length())
       return false;

       int[] freq=new int[26]; //ch 26 hote hai
       for(char c: s.toCharArray()){
        freq[c-'a']++;
       }
       for(char c: t.toCharArray()){
        freq[c-'a']--;
       }
       for(int x: freq)
       if(x!=0)
       return false;
       return true;


    }
}
