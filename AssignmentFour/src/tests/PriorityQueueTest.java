package tests;

import model.Restaurant;
import org.junit.Test;
import structure.PriorityQueue;

import static org.junit.Assert.*;

/**
 * Created by REA on 7/17/2017.
 */
public class PriorityQueueTest {
    Restaurant res1 = new Restaurant("Restaurant 1", "Super Fake Address 1", "Woodbridge", "VA", "22150", "34.0000", "-71.0000", "(703) 111-4909", "fakePhoto1" );
    Restaurant res2 = new Restaurant("Restaurant 2", "Super Fake Address 2", "Woodbridge", "VA", "22150", "34.0000", "-72.0000", "(571)123-1290", "fakePhoto1" );
    Restaurant res3 = new Restaurant("Restaurant 3", "Super Fake Address 3", "Woodbridge", "VA", "22150", "34.0003", "-73.0000", "(202) 231-4579", "fakePhoto1" );
    Restaurant res4 = new Restaurant("Restaurant 4", "Super Fake Address 4", "Woodbridge", "VA", "22150", "34.0004", "-74.0000", "(703)111-4909", "fakePhoto1" );
    Restaurant res5 = new Restaurant("Restaurant 5", "Super Fake Address 5", "Woodbridge", "VA", "22150", "34.0005", "-75.0000", "(583) 890-4444", "fakePhoto1" );
    Restaurant res6 = new Restaurant("Restaurant 6", "Super Fake Address 6", "Woodbridge", "VA", "22150", "34.0005", "-76.0000", "(757) 160-4444", "fakePhoto1" );
    Restaurant res7 = new Restaurant("Restaurant 7", "Super Fake Address 7", "Woodbridge", "VA", "22150", "34.0005", "-77.0000", "(571)234-4444", "fakePhoto1" );

    Restaurant res8 = new Restaurant("Restaurant 1", "Super Fake Address 6", "Woodbridge", "VA", "22150", "38.837951", "-77.210698", "(757) 160-4444", "fakePhoto1" );
    Restaurant res9 = new Restaurant("Restaurant 2", "Super Fake Address 7", "Woodbridge", "VA", "22150", "47.283258", "-122.480733", "(571)234-4444", "fakePhoto1" );

    PriorityQueue<Restaurant> q = new PriorityQueue<Restaurant>(10);

    @Test
    public void enqueue() throws Exception {
        PriorityQueue<Restaurant> q = new PriorityQueue<Restaurant>(10, res1.getDistanceComparator());

        res1.setDistance(Restaurant.calculateDistance(res9, res1));
        res2.setDistance(Restaurant.calculateDistance(res9, res2));
        res3.setDistance(Restaurant.calculateDistance(res9, res3));
        res4.setDistance(Restaurant.calculateDistance(res9, res4));
        res5.setDistance(Restaurant.calculateDistance(res9, res5));


        q.enqueue(res1);
        q.enqueue(res2);
        q.enqueue(res3);
        q.enqueue(res4);
        q.enqueue(res5);

        System.out.println(q);

    }

    @Test
    public void dequeue() throws Exception {
    }

    @Test
    public void isEmpty() throws Exception {
    }

    @Test
    public void isFull() throws Exception {
    }

    @Test
    public void size() throws Exception {
    }

}