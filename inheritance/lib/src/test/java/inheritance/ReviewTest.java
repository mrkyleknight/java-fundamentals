package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    @Test
    void testCreateEmptyReview(){
        Review myReview = new Review();
        assertNotNull(myReview);
    }
    @Test
    void testCreateNewReview(){
        Restaurant myRestaurant = new Restaurant("Chipolte", 15);
        Review myReview = new Review("Tom", "This is the body of review", 5, myRestaurant.getName());
        Review myReviewTwo = new Review("James", "This is the body of review", 3, myRestaurant.getName());
        myRestaurant.addReview(myReview);
        myRestaurant.addReview(myReviewTwo);
        assertNotNull(myReview);
        assertEquals(4.0, myRestaurant.getAverageStarRating());
        System.out.println(myReview);
        System.out.println(myRestaurant);

    }


}