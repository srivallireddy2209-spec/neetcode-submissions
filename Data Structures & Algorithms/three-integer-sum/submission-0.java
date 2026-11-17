class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i=0,j=nums.length-1;
        List<List<Integer>> arr2 = new ArrayList<>();
        Arrays.sort(nums);
       for(int x=0;x<nums.length;x++){
        int sum=nums[x];
        if(x>0 && nums[x]==nums[x-1])
        continue;
        i=x+1;
        j=nums.length-1;
        while(i<j){
            List<Integer> arr1= new ArrayList<>();
            if(x!=i && x!=j &&sum+nums[i]+nums[j]==0){
                arr1.add(nums[i]);
                arr1.add(nums[j]);
                arr1.add(nums[x]);
                arr2.add(arr1);
                i++;
                j--;
                while(i<j && nums[i]==nums[i-1])
                i++;
                while(i<j && nums[j]==nums[j+1])
                j--;
            }
            else if(nums[i]+nums[j]+sum>0)
            j--;
            else
            i++;
         
        }
        
       }
       return arr2;
    }
}
