package builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import builder.Publisher;

public class PublisherTest {

	@Test
    public void testPublisherId() {
        Publisher oPublisher = new PublisherBuilder().id(2).build();
        assertEquals(2, oPublisher.getId());
    }
	
	@Test
    public void testPublisherTitle() {
        Publisher oPublisher = new PublisherBuilder().title("Titulo").build();
        assertEquals("Titulo", oPublisher.getTitle());
    }
	
	@Test
    public void testPublisherCity() {
        Publisher oPublisher = new PublisherBuilder().city("Ciudad").build();
        assertEquals("Ciudad", oPublisher.getCity());
    }
	
	@Test
    public void testPublisherAuthor() {
		Author oAuthor  = new Author();
        Publisher oPublisher = new PublisherBuilder().author(oAuthor).build();
        assertEquals(oAuthor, oPublisher.getAuthor());
    }
}
