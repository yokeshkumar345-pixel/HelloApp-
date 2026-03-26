public class HelloAppUC5 {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2 & 3: One or more arguments
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            result.append(args[i]);

            // Add comma and space except after last name
            if (i < args.length - 1) {
                result.append(", ");
            }
        }

        System.out.println("Hello, " + result.toString() + "!");
    }
}