class Solution {
    public int search(int[] nums, int target) {
        int high=nums.length-1;
            int low=0,mid;
       while(low<=high)
       {
          mid=(high+low)/2;
           if(nums[mid]==target)
           {
               return mid;
           }
           else
           {
               if(target>nums[mid])
               {
                   low=mid+1;
               }
               else if(target<nums[mid])
               {
                   high=mid-1;
               }
           }
       }
        return -1;   
    }
}