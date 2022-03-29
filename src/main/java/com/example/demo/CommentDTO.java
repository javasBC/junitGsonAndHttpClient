package com.example.demo;

public class CommentDTO {

    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;


    @Override
    public String toString() {
        return "CommentDTO{" +
                "\n\tpostId=" + postId +
                "\n\t, id=" + id +
                "\n\t, name='" + name + '\'' +
                "\n\t, email='" + email + '\'' +
                "\n\t, body='" + body.replaceAll("\n","\n\t") + '\'' +
                "\n}";
    }

    public CommentDTO() {
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public CommentDTO(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }
}
