import java.util.UUID;

public class UUIDExample {
	public static void main(String[] args) {
		UUID id = UUID.randomUUID();
		System.out.println("Generated UUID: " + id);

		// Use in String form
		String uuidStr = id.toString();

		System.out.println("In String format " + uuidStr);

		// Parse from string
		UUID parsed = UUID.fromString(uuidStr);
		System.out.println("Parsed UUID: " + parsed);
	}

}
