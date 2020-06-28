package com.example.pojo;

/**
 * @BelongsProject: java_study_github
 * @BelongsPackage: com.example.pojo
 * @Author: LiZhaoShuai
 * @CreateTime: 2020/06/28 18:22
 * @Description: 简单实体类
 */
public class Greeting {

    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
