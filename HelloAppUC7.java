public class HelloAppUC7 {
    public static void main(String[] args) {

        String message;

        // Check if any names are provided
        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            // Default message
            message = "Hello, World!";
        }

        // Display output
        System.out.println(message);
    }
}
