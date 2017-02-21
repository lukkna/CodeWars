package validBraces;

public class BraceChecker {
    public static boolean isValid(String braces) {
        if (braces == null || braces.length() < 2 || braces.length() % 2 != 0 ||
                braces.chars().filter(ch -> ch == '(').count() != braces.chars().filter(ch -> ch == ')').count() ||
                braces.chars().filter(ch -> ch == '[').count() != braces.chars().filter(ch -> ch == ']').count() ||
                braces.chars().filter(ch -> ch == '{').count() != braces.chars().filter(ch -> ch == '}').count() ||
                braces.charAt(0) == ')' || braces.charAt(0) == ']' || braces.charAt(0) == '}' ||
                braces.charAt(braces.length() - 1) == '(' || braces.charAt(braces.length() - 1) == '[' ||
                braces.charAt(braces.length() - 1) == '{')
            return false;
        for (int i = 0; i < braces.length(); i++) {
            int j = i, open = 0, closed = 0;
            if (braces.charAt(i) == '[') {
                while (braces.charAt(j) != ']') {
                    if (braces.charAt(j) == '{' || braces.charAt(j) == '(')
                        open++;
                    if (braces.charAt(j) == '}' || braces.charAt(j) == ')')
                        closed++;
                    j++;
                }
                if (open != closed)
                    return false;
            }
        }
        return true;
    }
}