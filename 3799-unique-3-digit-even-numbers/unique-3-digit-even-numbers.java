class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;
        int num = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {

            // First digit cannot be 0
            if (digits[i] == 0) continue;

            num = num * 10 + digits[i];

            for (int j = 0; j < digits.length; j++) {

                if (j != i) {
                    num = num * 10 + digits[j];

                    for (int z = 0; z < digits.length; z++) {

                        if (z != j && z != i) {
                            num = num * 10 + digits[z];

                            if (num % 2 == 0) {
                                set.add(num);
                            }

                            // Remove digits[z]
                            num = (num - digits[z]) / 10;
                        }
                    }

                    // Remove digits[j]
                    num = (num - digits[j]) / 10;
                }
            }

            // Remove digits[i]
            num = (num - digits[i]) / 10;
        }

        return set.size();
    }
}