package composite;

public class PublisherLeaf extends PublisherComponent {

	private int id;

	private Publisher oPublisher;

	public PublisherLeaf(int id) {
		this.id = id;
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public void add(PublisherComponent publisherComponent) {
		// Do nothing because is leaf
	}

	@Override
	public void remove(PublisherComponent publisherComponent) {
		// Do nothing because is leaf
	}

	public Publisher getPublisher() {
		return oPublisher;
	}

	@Override
	public String view() {
		return "Hoja[" + id + "]";
	}
}
