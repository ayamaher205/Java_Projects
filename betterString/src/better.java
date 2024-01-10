import java.util.function.Predicate;

public class better implements IsBetter {
    public static String betterString(String s1, String s2, IsBetter is) {
        return is.isBetter(s1, s2) ? s1 : s2;
    }

    @Override
    public boolean isBetter(String s1, String s2) {
        return  s1.length()>s2.length();
    }
}
