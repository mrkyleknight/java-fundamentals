package inheritance;

public class Review {
    String author;
    String body;

    int stars;
    String restaurant;

    public Review(){};


    public Review(String author, String body, int stars, String restaurant){
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", stars=" + stars +
                ", restaurant='" + restaurant + '\'' +
                '}';
    }
}
