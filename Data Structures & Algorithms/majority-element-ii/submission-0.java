class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);         
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() > n / 3){
                ls.add(entry.getKey());
            }
        }
        return ls; 
        
    }
}