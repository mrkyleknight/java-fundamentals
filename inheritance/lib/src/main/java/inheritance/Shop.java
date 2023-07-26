package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private int numberOfDollarSigns;
    private ArrayList<Review> reviews;

    public Shop(String name, String description, int numberOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                ", reviews=" + reviews +
                '}';
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }
}
