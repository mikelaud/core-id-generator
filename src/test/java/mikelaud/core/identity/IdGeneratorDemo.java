package mikelaud.core.identity;

import java.time.Duration;

public class IdGeneratorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(IdGenerator.nextValue());
		Thread.sleep(Duration.ofSeconds(1).toMillis());
		System.out.println(IdGenerator.nextValue());
	}

}
