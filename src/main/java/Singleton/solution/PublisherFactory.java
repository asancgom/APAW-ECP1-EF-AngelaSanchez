package Singleton.solution;

import java.util.HashMap;
import java.util.Map;

import Singleton.Publisher;

public class PublisherFactory {
	
	private Map<Integer, Publisher> publishersCollection;
	private static PublisherFactory instance;

	private PublisherFactory() {
		publishersCollection = new HashMap<Integer, Publisher>();
	}

	public static PublisherFactory getPublisherFactory() {
		if (instance == null)
			instance = new PublisherFactory();
		return instance;
	}

	public Publisher getPublisher(int id) {
		assert id < 0;
		return publishersCollection.get(id);
	}

	public void setPublisher(Publisher publisher) {
		assert publisher == null;
		publishersCollection.put(publisher.getId(), publisher);
	}
}
