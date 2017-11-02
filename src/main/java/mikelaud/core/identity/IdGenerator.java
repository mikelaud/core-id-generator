package mikelaud.core.identity;

import java.time.Instant;

public class IdGenerator {

	private final int RADIX;
	
	public IdGenerator() {
		RADIX = 36;
	}

	public String nextValue() {
		return Long.toString(Instant.now().toEpochMilli(), RADIX).toUpperCase();
	}

}
