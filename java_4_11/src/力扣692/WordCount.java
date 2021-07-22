package 力扣692;

public class WordCount implements Comparable<WordCount> {
    String word;
    int count;


    public WordCount(String word,int count) {
        this.count = count;
        this.word = word;
    }

    @Override
    public int compareTo(WordCount o) {
        if (this.count == o.count) {
            return this.word.compareTo(o.word);
        }else {
            return o.count - this.count;//排出来的序是小大
        }
    }
}
