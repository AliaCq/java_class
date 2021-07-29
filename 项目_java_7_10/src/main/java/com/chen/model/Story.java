package com.chen.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class Story {
    public Integer sid;
    public String name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date createdAt;
    public Integer count;
}
