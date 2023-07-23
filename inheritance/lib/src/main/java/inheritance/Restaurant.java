package inheritance;


import java.util.ArrayList;

public class Restaurant {

    String name;
    int price = 0;
    int star;
    float averageStarRating;
    int totalReviews;
    ArrayList<Review> reviewList = new ArrayList<>();

    public Restaurant(){};


    public Restaurant(String name, int price){
        this.name = name;
        this.price = price;
    };

    public Review addReview(Review review){
        reviewList.add(review);
        this.star += review.stars;
        this.totalReviews++;
        this.averageStarRating = this.star / (float) totalReviews;
        return review;
    };

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", price=" + price +
//                ", star=" + star +
                ", averageStarRating=" + averageStarRating +
                ", totalReviews=" + totalReviews +
                ", reviewList=" + reviewList +
                '}';
    }

    public float getAverageStarRating() {
        return averageStarRating;
    }

    public void setAverageStarRating(float averageStarRating) {
        this.averageStarRating = averageStarRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
