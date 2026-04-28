class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> count =new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(count.containsKey(s.charAt(i))){
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }
            else{
                 count.put(s.charAt(i),1);

            }
    
        }

        for(int j=0;j<t.length();j++){
            if(count.containsKey(t.charAt(j))){
                count.put(t.charAt(j),count.get(t.charAt(j))-1);
            }
            else{
               return false;

            }
        }
       

for (int value : count.values()) {
    if (value != 0) {
     return false;
    }
}
        return true;

    }
}
