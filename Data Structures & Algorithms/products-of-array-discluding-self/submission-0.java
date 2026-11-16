class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] p = new int[nums.length];
        int[] s = new int[nums.length];
        int[] ans = new int[nums.length];
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        p[i]=(p[i-1]*nums[i]);
        s[nums.length-1]=nums[nums.length-1];
        int k=1;
        for(int i=nums.length-2;i>=0;i--){
            s[i]=(s[i+1]*nums[i]);
            k++;
        }
        ans[0]=s[1];
        ans[nums.length-1]=p[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            ans[i]=(p[i-1]*s[i+1]);
        }
        
       
        return ans;
    }
}  
