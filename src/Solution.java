public class Solution {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)))
                sb.append(s.charAt(i));

        StringBuilder sb2 = new StringBuilder("");

        for (int i = 0; i < sb.length(); i++)
            if (i % 3 == 0 && i != 0)
                sb2.append("-" + sb.charAt(i));
            else sb2.append(sb.charAt(i));

        if (sb2.charAt(sb2.length() - 2) == '-') {
            sb2.setCharAt(sb2.length() - 2, sb2.charAt(sb2.length() - 3));
            sb2.setCharAt(sb2.length() - 3, '-');
        }

        if (sb.length() > 4)
            if (sb2.charAt(sb2.length() - 4) == '-') {
                sb2.setCharAt(sb2.length() - 4, sb2.charAt(sb2.length() - 3));
                sb2.setCharAt(sb2.length() - 3, '-');
            }

        return sb2.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("004-448-555-583-61"));
        System.out.println(s.solution("022-198-53-24"));
        System.out.println(s.solution("555-372-654"));
        System.out.println(s.solution("5554-"));
        System.out.println(s.solution("555-"));
    }
}
