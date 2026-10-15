class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
         String da="";
         if(v[0].equals("")||v[0].equals(" "))
        da="";
        else
          if(v.length==1)
        da=v[0];
        else
        if(v.length>1)
        {
        String first = v[0];
          char t;
        int j=0,c;
       da="";
        for (int i = 0 ; i < first.length();i++){
            String s1 = first.substring(0,i+1);
         t=s1.charAt(i);
            c=1;
            for(j=1;j<v.length;j++){ 
                String s2 = v[j].substring(0,i+1);
                
                if (s1.equals(s2)){
                    c++; 
                }
            }
            if (c == v.length){
                da=da+t;
            }else{
                break;
            }} 
        }
        return (da);
    }
}