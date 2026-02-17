class Solution {
    public boolean isAnagram(String s, String t) {
    //   if(s.length()!=t.length())
    //   return false;
    //   char sarr[] =s.toCharArray();
    //    char tarr[] =t.toCharArray();
    //    Arrays.sort(sarr);
    //    Arrays.sort(tarr);          time complexity - zyda hai 
    //    return Arrays.equals(sarr, tarr);

////////////////////////////////////////////////////////

    //    if(s.length()!=t.length())
    //    return false;

    //    int[] freq=new int[26]; //ch 26 hote hai
    //    for(char c: s.toCharArray()){
    //     freq[c-'a']++;
    //    }
    //    for(char c: t.toCharArray()){
    //     freq[c-'a']--;
    //    }
    //    for(int x: freq)
    //    if(x!=0)
    //    return false;
    //    return true;


     HashMap<Character, Integer> map=new HashMap<>();
     if(s.length()!=t.length())
     return false;

     for(char c:s.toCharArray()){
        map.put(c, map.getOrDefault(c,0)+1);
     }
    for(char c:t.toCharArray()){
        if(!map.containsKey(c))
        return false;
        map.put(c,map.get(c)-1);
        if(map.get(c)==0)
        map.remove(c);

    }
    return map.isEmpty();
    }
}
