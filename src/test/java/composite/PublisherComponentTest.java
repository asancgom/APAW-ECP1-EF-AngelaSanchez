package composite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PublisherComponentTest {
	private PublisherComponent composite;

	private PublisherComponent leaf;

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void ini() {
		this.composite = new PublisherComposite("Compuesto");
		this.leaf = new PublisherLeaf(1);

	}

	@Test
	public void testViewIfLeaf() {
		assertEquals("Hoja[1]", this.leaf.view());
	}

	@Test
	public void testViewIfComposite() {
		assertEquals("[Compuesto]", this.composite.view());
	}

}
