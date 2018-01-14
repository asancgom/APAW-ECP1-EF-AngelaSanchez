package Singleton.solution;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import Singleton.Author;
import Singleton.Publisher;

public class PublisherFactoryTest {
	
	@Test
    public void testIsStudentsFactory() {
        assertSame(PublisherFactory.getPublisherFactory(), PublisherFactory.getPublisherFactory());
    }
    
    @Test
    public void testStudentsFactoryNotNull() {
        assertNotNull(PublisherFactory.getPublisherFactory());
    }
    
    public void testStudentsFactory() {
    	Author author = new Author(1,"Author1", "Spanish");
    	Publisher publisher = new Publisher(1,"Publisher1","Madrid",Calendar.getInstance(),author);
    	PublisherFactory.getPublisherFactory().setPublisher(publisher);
    	PublisherFactory.getPublisherFactory().getPublisher(1);
    }
	
}
