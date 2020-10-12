//Created by Pooja
//On 12 Oct 2020
// This program is implemented to remove dublicate letters from the given string.  

class Solution {
    public String removeDuplicateLetters(String s) {
       if(s == null || s.length() ==0){
           return "";
       } 
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <s.length(); i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        Set<Character> visited = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i=0; i < s.length(); i++){
            char current = s.charAt(i);
            map.put(current,map.get(current)-1);
            if (result.length() == 0){
                result.append(current);
                visited.add(current);
            }
            else if(!visited.contains(current)){
                while(result.length() > 0 && current < result.charAt(result.length()-1) && map.get(result.charAt(result.length() - 1))>0){
                    char previous = result.charAt(result.length()-1);
                    result.deleteCharAt(result.length() - 1);
                    visited.remove(previous);
                }
                result.append(current);
                visited.add(current);
            }
        }
        return result.toString();
    }
}