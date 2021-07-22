package leet692;
import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words, int k){
        Map<String,Integer> map = new TreeMap<>();

        //统计次数
        for (String w:words){
            int count = map.getOrDefault(w,0);
            map.put(w,count+1);
        }

        //将结果放到list中
        List<WordCount> wordCountList = new ArrayList<>();
        for (Map.Entry<String ,Integer> entry:map.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();
            WordCount wc = new WordCount(word,count);
            wordCountList.add(wc);
        }

        //排序
        PriorityQueue<WordCount> queue = new PriorityQueue<>();
        for (WordCount wc:wordCountList){
            if (queue.size() < k){
                queue.add(wc);
            }else if (wc.compareTo(queue.element()) > 0){
                queue.remove();
                queue.add(wc);
            }
        }

        //将前K个word存到List中
        List<String> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            WordCount wc = queue.remove();
            ans.add(0, wc.word);
        }

        return ans;
    }
}
