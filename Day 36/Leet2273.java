import java.util.*;
// class Solution {
//     public List<String> removeAnagrams(String[] words) {
//         List<String> result = new ArrayList<>();
//         int n = words.length;
//         result.add(words[0]);
//         char[] current = words[0].toCharArray();
//         Arrays.sort(current);
//         String top = new String(current);
//         for(int i = 1; i<n; i++){
//             current = words[i].toCharArray();
//             Arrays.sort(current);
//             String currentTop = new String(current);
//             if(top.equals(currentTop)){
//                 continue;
//             }
//             result.add(words[i]);
//             top = currentTop;
//         }
//         return result;
//     }
// }

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list= new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
         
                if(!isAnagram(words[i],words[i-1])){
                    list.add(words[i]);
                }
            }
        
        return list;
    }
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[]count= new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
   
}