class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        for(int i = 0; i< nums.length; i++){
            
            int index = Math.abs(nums[i]) - 1; //gets index from the element in array
            
            if(nums[index] < 0){
                
                ans.add(index + 1);
            }
            
            nums[index] = - nums[index]; //changes the index value to negative so if we re visit it we can just check positive or negative
            
        }
        
        
       return ans;
        
    }
}