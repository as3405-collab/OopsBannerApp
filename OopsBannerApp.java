public class OopsBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in a single statement using String.join()
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "W", "E", "L", "C", "O", "M", "E", " ", "*"),
                String.join("", "*", " ", "T", "O", " ", "O", "O", "P", "S", " ", "*"),
                String.join("", "*", " ", "B", "A", "N", "N", "E", "R", " ", "*"),
                String.join("", "*", " ", "A", "P", "P", " ", "U", "C", "5", " ", "*"),
                String.join("", "*", " ", "J", "A", "V", "A", " ", "D", "E", "M", "O"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}