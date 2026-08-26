class Solution {
    public int removeElement(int[] nums, int val) {
        
        int n = nums.length;

        int[] temp= new int[n];
        int cunnt = 0;
        
        for(int i = 0; i < n ; i++ ){
            
            if(nums[i] != val){
                temp[cunnt] = nums[i];
                cunnt++;
            }
                
        }
        for(int i = 0; i < cunnt; i++){
            nums[i] = temp[i];
        }
        return cunnt;  
    }
}