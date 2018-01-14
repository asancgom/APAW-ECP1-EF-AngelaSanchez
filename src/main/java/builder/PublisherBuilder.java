package builder;

import java.util.Calendar;

import builder.Publisher;

public class PublisherBuilder {

	private Publisher oPublisher;

	public PublisherBuilder() {
		this.oPublisher = new Publisher();
	}

	public PublisherBuilder id(int id) {
		oPublisher.setId(id);
		return this;
	}
	
	public PublisherBuilder title(String title) {
		oPublisher.setTitle(title);
		return this;
	}

	public PublisherBuilder city(String city) {
		oPublisher.setCity(city);
		return this;
	}

	public PublisherBuilder date(Calendar date) {
		oPublisher.setDate(date);
		return this;
	}
	
	public PublisherBuilder author(Author author) {
		oPublisher.setAuthor(author);
		return this;
	}

	public Publisher build() {
		return oPublisher;
	}
}
