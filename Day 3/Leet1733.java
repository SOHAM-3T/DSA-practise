import java.util.*;
class Leet1733 {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        // Find all users who cannot currently communicate with their friends
        Set<Integer> problematicUsers = new HashSet<>();       
        for (int[] friendship : friendships) {
            int u = friendship[0] - 1; // convert to 0-based
            int v = friendship[1] - 1;       
            // Create a Set to gather common languages which can be used to find if 
            // v can can communicate with u
            Set<Integer> uLangs = new HashSet<>();
            for (int lang : languages[u]) {
                uLangs.add(lang);
            }        
            boolean canCommunicate = false; //Logic to find if user u and v can communicate
            for (int lang : languages[v]) {
                if (uLangs.contains(lang)) {
                    canCommunicate = true;
                    break;
                }
            }         
            // If they cannot communicate, mark both users in problematicUsers
            if (!canCommunicate) {
                problematicUsers.add(u);
                problematicUsers.add(v);
            }
        }
        
        // Find the most known language
        int[] languageCount = new int[n + 1]; // language index: 1..n
        int maxAlreadyKnown = 0;
        
        for (int user : problematicUsers) {
            for (int lang : languages[user]) {
                languageCount[lang]++;
                maxAlreadyKnown = Math.max(maxAlreadyKnown, languageCount[lang]);
            }
        }
        
        // Minimum users to teach 
        return problematicUsers.size() - maxAlreadyKnown;
    }
}