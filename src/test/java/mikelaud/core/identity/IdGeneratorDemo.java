package mikelaud.core.identity;

public class IdGeneratorDemo {

	public static void main(String[] args) {
		final IdGenerator idGenerator = new IdGenerator();
		System.out.println(idGenerator.nextValue());
		System.out.println(idGenerator.nextValue());
	}

}
