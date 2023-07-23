package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void testCreateNewRestaurant(){
        Restaurant myRestaurant = new Restaurant("McDonalds" , 10);
        assertNotNull(myRestaurant);
        System.out.println(myRestaurant);
        assertEquals("McDonalds", myRestaurant.getName());
    };

    @Test
    void testGetAndSet(){
        Restaurant myRestaurant = new Restaurant();
        Restaurant newRestaurant = new Restaurant();
        myRestaurant.setName("Applebees");
        myRestaurant.setPrice(1);
        assertEquals("Applebees", myRestaurant.getName());
        assertEquals(1, myRestaurant.getPrice());
        System.out.println(myRestaurant);
        System.out.println(newRestaurant);
    }



}