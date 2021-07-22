package leet692;

public class WordCount implements Comparable<WordCount> {
    String word;
    int count;


    public WordCount(String word, int count) {
        this.count = count;
        this.word = word;
    }

    @Override
    public int compareTo(WordCount o) {
        if (this.count == o.count) {
            return o.word.compareTo(this.word);
        }else {
            return this.count - o.count;
        }
    }
}
