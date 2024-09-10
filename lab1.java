import java.util.Scanner;

/**
 * lab1
 */
public class lab1 {

    public static void main(String[] args) {
        try {
            int x = 0, y = 0, total = 0;
            boolean valid = true;
            String format;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the following format 1 + 1");
            format = sc.nextLine();

            // split the example string 20 + 15 into parts "20" "+" and "15"
            String[] parts = format.split(" ");
            if (parts.length == 3) {
                // x = "20"
                x = Integer.parseInt(parts[0]);
                // y = "15"
                y = Integer.parseInt(parts[2]);

                if (format.contains("+")) {
                    total = x + y;
                } else if (format.contains("-")) {
                    total = x - y;
                } else if (format.contains("*")) {
                    total = x * y;
                } else if (format.contains("/")) {
                    total = x / y;
                } else {
                    System.out.println("Incorrect symbol!");
                    valid = false;
                }
                if (valid) {
                    System.out.println(total);
                }
            } else {
                System.out.println("Enter a space between the numbers and symbols!");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Enter the correct format! ");
        }
    }
}