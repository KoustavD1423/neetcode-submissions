class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hs = new HashMap<>();
        
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!hs.containsKey(key)){
                hs.put(key, new ArrayList<>());
            }
            hs.get(key).add(str);
        }
        return new ArrayList<>(hs.values()); 
    }
}
