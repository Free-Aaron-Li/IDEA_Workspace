package s0014;

public class GetSameFirst {
    public static boolean longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return false;
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }
}
