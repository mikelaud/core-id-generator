package mikelaud.core.identity;

import java.time.Instant;
import java.util.Objects;

public class IdGenerator {

	private final int RADIX;
	
	private String mPrevValue;
	
	public IdGenerator() {
		RADIX = 36;
		mPrevValue = nextValue();
	}

	public String nextValue() {
		String nextValue = "";
		for (;;) {
			nextValue = Long.toString(Instant.now().toEpochMilli(), RADIX).toUpperCase();
			if (Objects.equals(mPrevValue, nextValue)) {
				Thread.yield();
				continue;
			}
			mPrevValue = nextValue;
			break;
		}
		return nextValue;
	}

}
