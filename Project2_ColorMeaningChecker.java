import java.util.*;

public class ColorMeaningChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> colorMeanings = new HashMap<>();

        // Predefined colors
        colorMeanings.put("Red", "Symbolizes passion, energy, and love.");
        colorMeanings.put("Blue", "Symbolizes calmness, trust, and wisdom.");
        colorMeanings.put("Green", "Symbolizes growth, harmony, and freshness.");
        colorMeanings.put("Yellow", "Symbolizes happiness, optimism, and energy.");

        while (true) {
            System.out.println("\nEnter a color name (or type 'add', 'list', or 'exit'):");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("👋 Exiting program.");
                break;
            } else if (input.equalsIgnoreCase("list")) {
                System.out.println("Available colors: " + colorMeanings.keySet());
            } else if (input.equalsIgnoreCase("add")) {
                System.out.print("Enter new color name: ");
                String newColor = scanner.nextLine().trim();
                System.out.print("Enter meaning for " + newColor + ": ");
                String newMeaning = scanner.nextLine().trim();
                colorMeanings.put(newColor, newMeaning);
                System.out.println("✅ New color added successfully!");
            } else {
                String meaning = colorMeanings.get(input);
                if (meaning != null) {
                    System.out.println("✅ " + input + ": " + meaning);
                } else {
                    System.out.println("❌ Color not found. Try again.");
                }
            }
        }
    }
}
