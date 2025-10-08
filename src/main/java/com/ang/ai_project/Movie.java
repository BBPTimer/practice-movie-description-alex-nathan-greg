package com.ang.ai_project;

public class Movie {
    private String title;
    private int Rating;
    private String description;
    private String boxOffice;

    public Movie() {
    }

    public Movie(String title, int rating) {
        this.title = title;
        Rating = rating;
    }

    public Movie(String title, int rating, String description) {
        this.title = title;
        Rating = rating;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", Rating=" + Rating +
                ", description='" + description + '\'' +
                ", boxOffice='" + boxOffice + '\'' +
                '}';
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

}
