public class Solution2 {
    public String solution2(String s) {
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                result.append(s.charAt(i));
            }
        }

        StringBuilder newResult = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            newResult.append(result.charAt(i));
            if (i % 3 == 2) {
                newResult.append("-");
            }
        }
        if (result.length() % 3 == 0) {
            newResult.deleteCharAt(newResult.length() - 1);
        }
        if (result.length() % 3 == 1) {
            newResult.deleteCharAt(newResult.length() - 2);
            newResult.insert(newResult.length() - 2, "-");
        }
        return newResult.toString();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();

        System.out.println(s.solution2("004-448-555-583-61"));
        System.out.println(s.solution2("022-198-53-24"));
        System.out.println(s.solution2("555-372-654"));
        System.out.println(s.solution2("5555-"));
        System.out.println(s.solution2("555-"));
    }
}
