package mikelaud.core.identity;

import java.time.Duration;

public class IdGeneratorDemo {

	public static void main(String[] args) throws InterruptedException {
		final IdGenerator idGenerator = new IdGenerator();
		System.out.println(idGenerator.nextValue());
		Thread.sleep(Duration.ofSeconds(1).toMillis());
		System.out.println(idGenerator.nextValue());
	}

}
