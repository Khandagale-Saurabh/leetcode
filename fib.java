class Solution {
    public int fib(int n) {
        if(n==0)
        {
            return n;
        }
        else if(n==1||n==2)
        {
            return 1;
        }
       
     return fib(n-1)+fib(n-2);
        //return sum;
        
    }
}
