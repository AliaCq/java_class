package 力扣692;
import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words,int k){
        Map<String,Integer> map = new TreeMap<>();
        for (String w:words){
            int count = map.getOrDefault(w,0);
            map.put(w,count+1);
        }

        List<WordCount> wordCountList = new ArrayList<>();
        for (Map.Entry<String ,Integer> entry:map.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();
            WordCount wc = new WordCount(word,count);
            wordCountList.add(wc);
        }
        Collections.sort(wordCountList);
        List<String> ans = new ArrayList<>();
        for (int i = 0;i < k && i < wordCountList.size(); i++){
            WordCount wc = wordCountList.get(i);
            ans.add(wc.word);
        }
        return ans;
    }
}
