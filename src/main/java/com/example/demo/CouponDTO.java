package com.example.demo;

public class CouponDTO {
    private int id;
    private String title;
    private String genre;
    private int available;

    @Override
    public String toString() {
        return "CouponDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", available=" + available +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public CouponDTO() {
    }

    public CouponDTO(int id, String title, String genre, int available) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.available = available;
    }

    @Override
    public boolean equals(Object obj) {
        CouponDTO other = (CouponDTO) obj;
        return (id==other.id
                && title.equals(other.title)
                && genre.equals(other.genre)
                && available==other.available);
    }
}
