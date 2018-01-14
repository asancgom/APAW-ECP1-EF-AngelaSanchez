package composite;

import java.util.ArrayList;
import java.util.List;

public class PublisherComposite extends PublisherComponent {

	private String name;

	List<PublisherComponent> publisherComponentList;

	public PublisherComposite(String name) {
		this.name = name;
		publisherComponentList = new ArrayList<>();
	}

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public void add(PublisherComponent publisherComponent) {
		assert publisherComponent != null;
		publisherComponentList.add(publisherComponent);
	}

	@Override
	public void remove(PublisherComponent publisherComponent) {
		assert publisherComponent != null;
		publisherComponentList.remove(publisherComponent);
	}

	@Override
	public String view() {
		return "[" + this.name + "]";
	}

}
