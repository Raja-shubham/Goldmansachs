package gs;

import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        List<String> dict = Arrays.asList("to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana");
        String letter = "oetdg";
        System.out.println(dict.contains(letter));;
        System.out.println(longestWord(letter,dict));
    }

    private static Set<String> longestWord(String letter, List<String> dict) {

        Set<String> res = new HashSet<>();
        int maxLength =0;
        for(String word :dict){
            if(canFormWord(letter,word)){
                if(word.length()>maxLength){
                    maxLength= word.length();
                    res.clear();
                    res.add(word);
                }else if(word.length()==maxLength){
                    res.add(word);
                }
            }
        }
        return res;
    }

    private static boolean canFormWord(String letter, String word) {
        Map<Character, Integer> letterMap = new HashMap<>();
        for(char ch :letter.toCharArray()){
            letterMap.put(ch,letterMap.getOrDefault(ch,0)+1);
        }

        for(char c :word.toCharArray()){
            if(!letterMap.containsKey(c)||letterMap.get(c)==0){
                return false;
            }
            else{
                letterMap.put(c,letterMap.get(c)-1);
            }
        }
        return  true;
    }
}
