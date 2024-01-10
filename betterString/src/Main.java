import java.io.RandomAccessFile;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String longer = better.betterString("ali", "ahmed", (s1, s2) -> s1.length() > s2.length());
        System.out.println("Longer string: " + longer);

        // Always pick the first string
        String first = better.betterString("ali", "ahmed", (s1, s2) -> true);
        System.out.println("First string: " + first);
    }
}