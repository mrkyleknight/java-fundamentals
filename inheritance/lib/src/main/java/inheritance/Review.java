package inheritance;

public class Review {
    private String author;
    private String body;
    int stars;
    private String businessName;

    public Review(){};

    public Review(String author, String body, int stars, String businessName){
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.businessName = businessName;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", stars=" + stars +
                ", businessName='" + businessName + '\'' +
                '}';
    }
}
