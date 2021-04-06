class Solution {
    public List<String> fizzBuzz(int n) 
    {
        ArrayList<String> a1=new ArrayList<>();
      
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                a1.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                a1.add("Fizz");
            }
            else if(i%5==0)
            {
                a1.add("Buzz");
            }
            else
            {
                a1.add(""+i);
            }
                
        }
        return a1;
        
    }
}
