package mikelaud.core.identity;

import java.time.Instant;

public class IdGenerator {

	private static final int RADIX = 36;

	public static String nextValue() {
		return Long.toString(Instant.now().toEpochMilli(), RADIX).toUpperCase();
	}

}
