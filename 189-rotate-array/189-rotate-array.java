class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        swap(nums, 0, nums.length-1-k);
        swap(nums, nums.length-k, nums.length-1);
        swap(nums, 0, nums.length-1);
    }
        
            
            void swap(int nums[],int l,int r)
            {
                int temp;
            while(l<=r)
            {
                temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            l++;
            r--;
            }
            }
       
    }
