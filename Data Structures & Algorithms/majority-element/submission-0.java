class Solution {
    public int majorityElement(int[] nums) {
       
        HashMap<Integer, Integer> freqMap = new HashMap<>();



        for (int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }
        int n = nums.length;
        //iterating over the hashmap to get keys and using get function to get the frequency of majority element
        for(int key : freqMap.keySet()){
            if(freqMap.get(key) > n / 2){
                return key;
            }
        }
        return -1;
    }
}