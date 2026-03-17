public class HelloAppUC4 {
    public static void main(String[] args) {

        // Check if arguments are passed
        if (args.length > 0) {
            System.out.print("Hello ");

            // Print all arguments
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);

                // Add space between words
                if (i != args.length - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println("!");
        } else {
            // Default message
            System.out.println("Hello, Java!");
        }
    }
}
