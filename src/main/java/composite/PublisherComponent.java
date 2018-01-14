package composite;


public abstract class PublisherComponent {

	public PublisherComponent() {
    }
    
    public abstract boolean isComposite();
    
    public abstract void add(PublisherComponent publisherComponent);
    
    public abstract void remove(PublisherComponent publisherComponent);
    
    public abstract String view();

}
