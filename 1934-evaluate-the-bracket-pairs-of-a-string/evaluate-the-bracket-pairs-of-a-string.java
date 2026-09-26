class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int first = i;

                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == ')') {
                        int last = j;

                        String sub = s.substring(first + 1, last);
                        String value = map.get(sub);

                        if (value == null) {
                            value = "?";
                        }

                        s = s.substring(0, first) + value + s.substring(last + 1);

                        i = first + value.length() - 1;
                        break;
                    }
                }
            }
        }

        return s;
    }
}