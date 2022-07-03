class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] res = new int[nums.length - k + 1];
        int idx = 0;
        
        Deque<Integer> q = new ArrayDeque<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            
            //remove first 
            
            if((q.size() > 0 && q.getFirst() <= i - k)){
                q.removeFirst();
            }
            
            //removeLast -> smaller than our current elements
            while(q.size() > 0 && nums[q.getLast()] < nums[i]){
                q.removeLast();
            }
            
            //addLast -> We maybe answer of current or upcoming windows
            
            q.addLast(i);
            
            if(i >= k - 1){
                //starting elements include na ho 
                res[idx++] = nums[q.getFirst()];
            }
            
            
        }
               
        return res;
        
    }
}