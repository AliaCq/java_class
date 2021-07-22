import com.fasterxml.jackson.annotation.JsonInclude;

public class Article {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer authorId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String authorName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String authorAvatar;
    public String title;
    public String contentBrief;
    public Integer viewCount;
    public Integer likeCount;
    public Integer commentCount;
}
