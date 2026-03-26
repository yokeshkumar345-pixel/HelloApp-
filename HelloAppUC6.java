public class HelloAppUC6 {
    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // Build string with trailing comma and space
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove last ", " using substring
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);

            // Print final greeting
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}
