class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq = 0;
        int left = 0;
        int maxWindow = 0;
        int[] freq = new int[26];
        Map<Character, Integer> mp = new HashMap<>();
        for (int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);
            int windowlength = right - left + 1;
            if(windowlength - maxfreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxWindow = Math.max(right - left + 1, maxWindow);
        }
        return maxWindow;
    }
}
