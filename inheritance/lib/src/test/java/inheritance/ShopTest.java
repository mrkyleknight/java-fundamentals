package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @Test
    void getName() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void getNumberOfDollarSigns() {
    }

    @Test
    void testCreateNewReviewForShop(){
        Shop myShop = new Shop("Shopify", "Online shop", 3);
        Review myReview = new Review("Tom", "This is a review for a shop", 5, myShop.getName());
        Review myReviewTwo = new Review("James", "Another review for the shop", 3, myShop.getName());
        myShop.addReview(myReview);
        myShop.addReview(myReviewTwo);
        assertNotNull(myReview);
        assertEquals(2, myShop.getReviews().size());
        System.out.println(myReview);
        System.out.println(myShop);
    }


    @Test
    void testToString() {
    }
}