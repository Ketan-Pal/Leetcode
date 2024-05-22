class Solution {
    public List<List<String>> partition(String s) {
        Set<List<String>> set = new HashSet<>();
        goRecursively(0, 1, s, new ArrayList<>(), set);
        return new ArrayList<>(set);
    }

    private void goRecursively(int start, int end, String s,
                                      List<String> list, Set<List<String>> set) {
        if (listLength(list) >= s.length()) {
            set.add(new ArrayList<>(list));
            return;
        }

        if (end > s.length()) return;

        String temp = s.substring(start, Math.min(end, s.length()));
        if (isPalindrome(temp)) {
            list.add(temp);
            goRecursively(end, end + 1, s, list, set);
            list.remove(list.size() - 1);
        }

        goRecursively(start, end + 1, s, list, set);
    }

    private int listLength(List<String> list) {
        int len = 0;
        for (String s : list) len += s.length();
        return len;
    }

    private boolean isPalindrome(String s) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return true;
    }
}