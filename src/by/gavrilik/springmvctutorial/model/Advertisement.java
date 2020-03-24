package by.gavrilik.springmvctutorial.model;

import javax.swing.*;

public class Advertisement {

    private int id;
    private Spring name;
    private Spring description;
    private int rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Spring getName() {
        return name;
    }

    public void setName(Spring name) {
        this.name = name;
    }

    public Spring getDescription() {
        return description;
    }

    public void setDescription(Spring description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
