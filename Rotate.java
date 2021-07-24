import java.util.*;
//to rotate
   public class Rotate{

   public static void main(String[] args)
    {
        int a=244513;
        int b=10;
          String s=""+a;
       int len=s.length();
       System.out.println(len);
       int k=-10;
       k=k%len;
       if(k<0)
       {
		k=len+k;
	   }
	   System.out.println("k="+k);

	   int mult=(int)Math.pow(10,len-k);
	   int div=(int)Math.pow(10,k);

	   System.out.println(mult);

	   System.out.println(div);
	   int lastkdig=a%div;
	   int firstkdig=a/div;

	   System.out.println(lastkdig);

	   System.out.println("f="+firstkdig);

    }
   }
