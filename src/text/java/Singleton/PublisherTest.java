package Singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;


public class PublisherTest {

	@Test
    public void testIsSingleton() {
        assertSame(Publisher.getPublisher(), Publisher.getPublisher());
    }

    @Test
    public void testSingletonNotNull() {
        assertNotNull(Publisher.getPublisher());
    }
}

