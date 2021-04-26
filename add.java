class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int ans1=-1,ans2=-1;
      for(int i=0;i<nums.length-1;i++)
      {
          for(int j=i+1;j<nums.length;j++)
          {
              if(nums[i]+nums[j]==target)
              {
                  ans1=i;
                  ans2=j;
              }
          }
      }
        //System.out.println(ans1+" "+ans2);
        int ans[]=new int[2];
        ans[0]=ans1;
        ans[1]=ans2;
        
        return ans;
    }
}
