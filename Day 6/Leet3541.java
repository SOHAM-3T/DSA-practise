import java.util.*;
class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> Dict = new HashMap<>();
        for(char c : s.toCharArray()){
            if(Dict.containsKey(c)){
                Dict.put(c,Dict.get(c)+1);
            }
            else{
                Dict.put(c,1);
            }
        }
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int vowel = 0;
        int consonant = 0;
        
        for (Map.Entry<Character, Integer> entry : Dict.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            
            if (vowels.contains(character)) {
                vowel = Math.max(vowel, frequency);
            } else {
                consonant = Math.max(consonant, frequency);
            }
        }
        
        return vowel + consonant;
    }
}