
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2)
    {
       BigInteger l1=new BigInteger(num1);
        
        BigInteger l2=new BigInteger(num2);
        
         BigInteger sum=l1.add(l2);
        return ""+sum;
    }
}
