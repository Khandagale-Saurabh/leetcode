class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
      String st[]= sentence.split(" ");
        int ser_leng=searchWord.length();
        for(int i=0;i<st.length;i++)
        {
          if(st[i].length()>=searchWord.length())
          {
              if(st[i].substring(0,searchWord.length()).equals(searchWord))
              {
                  return i+1;
              }
          }
        }
        return -1;
    }
}
