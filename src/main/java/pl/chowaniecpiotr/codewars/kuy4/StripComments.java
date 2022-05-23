package pl.chowaniecpiotr.codewars.kuy4;

/**
 * @author Piotr Chowaniec
 */
public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = stripInLine(lines[i], commentSymbols);
        }
        return String.join("\n", lines);
    }

    private static String stripInLine(String line, String[] commentSymbols) {
        var end = line.length();
        for (String symbol : commentSymbols) {
            if (line.contains(symbol) && line.indexOf(symbol) < end) {
                end = line.indexOf(symbol);
            }
        }
        return line.substring(0, end).stripTrailing();
    }
}
