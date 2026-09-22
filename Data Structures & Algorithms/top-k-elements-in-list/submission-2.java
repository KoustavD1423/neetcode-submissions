class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> mp = new HashMap<>();
       for (int num : nums){
        mp.put(num, mp.getOrDefault(num, 0) + 1);
       }
       List<int[]> ls = new ArrayList<>();
       for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
        ls.add(new int[] {entry.getValue(), entry.getKey()});
       }
        ls.sort((a, b)-> Integer.compare(b[0], a[0]));

        int[] res = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = ls.get(i)[1];
        }
        return res;
    }
}
