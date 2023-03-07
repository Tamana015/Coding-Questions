class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> Values = new HashMap<>();
         int result[] ={0,0};
         for( int i=0;i<nums.length;i++)
         {
             if(Values.containsKey(target-nums[i]))
             {
                 result[0]=Values.get(target-nums[i]);
                 result[1]=i;
                 return result;
             }
             Values.put(nums[i],i);
         }
         return result;
    }
}