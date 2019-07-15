import java.util.ArrayList;
import java.util.List;

public class StringPerm {
    public static void main(String[]args){
        stringPermutations("abc");

    }
    public static ArrayList<String> stringPermutations(String s) {
        ArrayList<String> result = new ArrayList<String>();
        stringPermutations("", s, result);
        return result;
    }

    private static void stringPermutations(String prefix, String suffix, List<String> results) {
        if (suffix.length() == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                stringPermutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, suffix.length()),results);
            }
        }
    }
}
