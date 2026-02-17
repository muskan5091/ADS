// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {

        // for (char c : ransomNote.toCharArray()) {

        //     int index = magazine.indexOf(c);

        //     if (index == -1) return false;

        //     magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        // }

        // return true;

       class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // count letters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // use letters for ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }

        return true;
    }
}


//     }
// }
