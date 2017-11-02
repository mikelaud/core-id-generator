package mikelaud.core.identity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class IdGeneratorTest {

	private IdGenerator mIdGenerator = null;
	
	@Before
	public void before() {
		mIdGenerator = new IdGenerator();
	}
	
	@Test
	public void testConstructor() {
		assertNotNull(mIdGenerator);
	}
	
	@Test
	public void testNextValue() {
		assertNotNull(mIdGenerator.nextValue());
		assertTrue(mIdGenerator.nextValue().length() > 0);
	}

}
