class Solution {
    
		 	  public static boolean checkIfPangram(String sentence)
		    {
		     ArrayList a1=new ArrayList<>();
		     ArrayList a2=new ArrayList<>();


 for(int i=0;i<sentence.length();i++)
			  {

			      int ch=(int)sentence.charAt(i);
				  if(!a1.contains(ch))
				  {
					  int u=(int)ch;
			          a1.add(u);
			       }
			  }

		     for(int i=97;i<=122;i++)
		     {
				 a2.add(i);
				 }

			Collections.sort(a1);
			System.out.println(a1);
			System.out.println(a2);
			if(a1.size()!=a2.size())
							 {
								 return false;
					 }
			for(int i=0;i<a1.size();i++)
			{
				int n1=(int)a1.get(i);
				int n2=(int)a2.get(i);
				if(n1!=n2)
				{
					return false;
				}


			}

			  //  System.out.println(a1);
			  //     System.out.println(a2);
			        return true;
		    }

}
