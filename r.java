import java.util.*;
class r
{
 public static void main(String aa[])
 {
    System.out.println(""+paths(5,6));
 }

 public static ArrayList<String> paths(int N,int M)
    {
        if(N<0)
        {
             ArrayList<String> Empty=new ArrayList();

            return Empty;
        }
        if(N==0)
        {
            ArrayList<String> ans=new ArrayList();
            ans.add("");
        }

        	ArrayList<String> p1=paths(N-1,M);
    ArrayList<String> ans_path=new ArrayList<String>();

         for(String ss:p1)
         {
		   ans_path.add(ss+2);
		  }

        return ans_path;
    }
}
