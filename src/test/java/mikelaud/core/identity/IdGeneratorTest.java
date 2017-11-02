package mikelaud.core.identity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IdGeneratorTest {

	@Test
	public void testNextValue() {
		assertNotNull(IdGenerator.nextValue());
		assertTrue(IdGenerator.nextValue().length() > 0);
	}

}
