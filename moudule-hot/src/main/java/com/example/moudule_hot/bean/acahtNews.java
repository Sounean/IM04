package com.example.moudule_hot.bean;

public class acahtNews {
    private int id;
    private String username;
    private String title;
    private String message;
    private String data;

    public acahtNews() {
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "acahtNews{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public acahtNews(int id, String username, String title, String message, String data) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.message = message;
        this.data = data;
    }

    public acahtNews(String newsTitle , String newsContent){
        this.title = newsTitle;
        this.message = newsContent;
        this.data = "2020年1月11号";
        this.username = "Admin";
    }
}
