class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
       for(int i=0;i<nums.length;i++)
        {
           a1.add(nums[i]);
         }
        
        Collections.sort(a1);
        int max=a1.size();
        int min=1;
        for(int i=min;i<=max;i++)
        {
            if(a1.contains(i))
            {
                
            }
            else
            {
                a2.add(i);
            }
        }
        
        return a2;
    }
}
